package interpreter.alertRule;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 或表达式
 */
public class OrExpression implements Expression{
    private List<Expression> expressions = new ArrayList<>();

    public OrExpression(List<Expression> expressions) {
        this.expressions = expressions;
    }

    public OrExpression(String strOrExpression) {
        String[] andExpressions = strOrExpression.split("\\|\\|");
        for(String andExpr : andExpressions) {
            expressions.add(new AndExpression(andExpr));
        }
    }

    /**
     * 解释或表达式
     *
     * @param states
     * @return
     */
    @Override
    public boolean interpret(Map<String, Long> states) {
        for(Expression expr : expressions) {
            if(expr.interpret(states)) {
                return true;
            }
        }
        return false;
    }
}
