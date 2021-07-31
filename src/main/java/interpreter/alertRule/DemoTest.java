package interpreter.alertRule;

import java.util.HashMap;
import java.util.Map;

/**
 * 测试类
 */
public class DemoTest {
    public static void main(String[] args) {
        String rule = "key1 > 100 && key2 < 30 && key3 < 100 || key3 < 100 || key4 == 88";
        AlertRuleInterpreter interpreter = new AlertRuleInterpreter(rule);
        Map<String, Long> stats = new HashMap<>();
        stats.put("key1", 101L);
        stats.put("key2", 50L);
        stats.put("key3", 121L);
        stats.put("key4", 88L);
        boolean alert = interpreter.interpret(stats);
        System.out.println(alert);
    }
}
