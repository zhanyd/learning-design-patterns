package interpreter.alertRule;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 与表达式
 */
public class AndExpression implements Expression{
    private List<Expression> expressions = new ArrayList<>();

    public AndExpression(List<Expression> expressions) {
        this.expressions = expressions;
    }

    public AndExpression(String strAndExpression) {
        String[] strExpressions = strAndExpression.split("&&");
        for(String strExpr : strExpressions) {
            if(strExpr.contains(">")) {
                expressions.add(new GreaterExpression(strExpr));
            } else if(strExpr.contains("<")) {
                expressions.add(new LessExpression(strExpr));
            } else if(strExpr.contains("==")) {
                expressions.add(new EqualExpression(strExpr));
            } else {
                throw new RuntimeException("Expression is invalid: " + strAndExpression);
            }
        }
    }

    /**
     * 解释与表达式
     *
     * @param states
     * @return
     */
    @Override
    public boolean interpret(Map<String, Long> states) {
        for(Expression exor : expressions) {
            if(!exor.interpret(states)) {
                return false;
            }
        }
        return true;
    }
}
