package interpreter.blindDateRule;

import java.util.Map;

/**
 * 相亲表达式解析
 */
public class BlindDateRuleInterpreter {

    private Expression expression;

    /**
     * 先从或表达式开始解析
     * @param ruleExpression
     */
    public BlindDateRuleInterpreter(String ruleExpression) {
        this.expression = new OrExpression(ruleExpression);
    }

    public boolean interpret(Map<String, Integer> states) {
        return expression.interpret(states);
    }
}
