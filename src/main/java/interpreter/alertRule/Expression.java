package interpreter.alertRule;

import java.util.Map;

/**
 * 表达式接口
 */
public interface Expression {
    /**
     * 解释表达式
     * @param states
     * @return
     */
    boolean interpret(Map<String, Long> states);
}
