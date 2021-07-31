package interpreter.alertRule;

import java.util.Map;

/**
 * 等于表达式
 */
public class EqualExpression implements Expression{
    private String key;
    private long value;

    public EqualExpression(String key, long value) {
        this.key = key;
        this.value = value;
    }

    public EqualExpression(String strExpression) {
        String[] elements = strExpression.trim().split("\\s+");
        if(elements.length != 3 || !elements[1].trim().equals("==")) {
            throw new RuntimeException("Expression is invalid: " + strExpression);
        }
        this.key = elements[0].trim();
        this.value = Long.parseLong(elements[2].trim());
    }

    /**
     * 解释等于表达式
     * @param states
     * @return
     */
    @Override
    public boolean interpret(Map<String, Long> states) {
        if(!states.containsKey(key)) {
            return false;
        }
        long stateValue = states.get(key);
        return stateValue == value;
    }
}
