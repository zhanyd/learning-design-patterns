package interpreter.blindDateRule;

import java.util.HashMap;
import java.util.Map;

/**
 * 客户端测试类
 */
public class ClientTest {
    public static void main(String[] args) {
        // 为了更贴近生活，这里的key就用中文了
        String rule = "房子 >= 1 && 年收入 >= 20 && 身高 >= 175 && 年龄 < 30 && 学历 >= 4 || 财产 >= 1000";
        BlindDateRuleInterpreter interpreter = new BlindDateRuleInterpreter(rule);
        Map<String, Integer> stats = new HashMap<>();
        stats.put("房子", 1);
        stats.put("年收入", 20);
        stats.put("身高", 176);
        stats.put("年龄", 28);
        stats.put("学历", 4);
        stats.put("财产", 100);
        // 根据表达式判断相亲条件
        boolean qualified = interpreter.interpret(stats);
        if(qualified) {
            System.out.println("兄弟，恭喜你符合条件啦！");
        } else {
            System.out.println("兄弟，还需继续努力！");
        }
    }
}
