package interpreter.blindDateRule;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 或表达式
 */
public class OrExpression implements Expression {
    private List<Expression> expressions = new ArrayList<>();

    public OrExpression(List<Expression> expressions) {
        this.expressions = expressions;
    }

    public OrExpression(String strOrExpression) {
        String[] andExpressions = strOrExpression.split("\\|\\|");
        for(String andExpr : andExpressions) {
            // &&表达式的优先级比||表达式高，计算||表达式之前要先计算&&表达式
            // 这里复用&&表达式
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
    public boolean interpret(Map<String, Integer> states) {
        for(Expression expr : expressions) {
            if(expr.interpret(states)) {
                return true;
            }
        }
        return false;
    }
}
