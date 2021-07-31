package interpreter.alertRule;

import java.util.Map;

/**
 * 报警信息解析
 */
public class AlertRuleInterpreter {
    private Expression expression;

    /**
     * 先从或表达式开始解析
     * @param ruleExpression
     */
    public AlertRuleInterpreter(String ruleExpression) {
        this.expression = new OrExpression(ruleExpression);
    }

    public boolean interpret(Map<String, Long> states) {
        return expression.interpret(states);
    }
}
