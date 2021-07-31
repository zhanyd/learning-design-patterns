package interpreter.blindDateRule;

import java.util.Map;

/**
 * 小于表达式
 */
public class LessExpression implements Expression {
    private String key;
    private int value;

    public LessExpression(String key, int value) {
        this.key = key;
        this.value = value;
    }

    public LessExpression(String strExpression) {
        String[] elements = strExpression.trim().split("\\s+");
        if(elements.length != 3 || !elements[1].trim().equals("<")) {
            throw new RuntimeException("Expression is invalid: " + strExpression);
        }
        this.key = elements[0].trim();
        this.value = Integer.parseInt(elements[2].trim());
    }

    /**
     * 解释小于表达式
     * @param states
     * @return
     */
    @Override
    public boolean interpret(Map<String, Integer> states) {
        if(!states.containsKey(key)) {
            return false;
        }
        int stateValue = states.get(key);
        return stateValue < value;
    }
}
