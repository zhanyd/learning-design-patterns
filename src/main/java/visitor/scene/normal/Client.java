package visitor.scene.normal;

import java.util.ArrayList;
import java.util.List;

/**
 * 客户端
 */
public class Client {

    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Young("工作不顺利"));
        personList.add(new MiddleAged("工作不顺利"));
        personList.add(new Young("年终奖"));
        personList.add(new MiddleAged("年终奖"));
        personList.add(new Young("周末"));
        personList.add(new MiddleAged("周末"));

        personList.stream().forEach(f -> f.answer());
    }
}
