package prototype.monster.normal;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        List<Monster> monsterList = new ArrayList<Monster>();
        Monster monster = new Monster("飞龙", 200, 100);

        for(int i = 0; i < 10; i++) {
            monsterList.add((Monster)monster.clone());
        }

        monsterList.stream().forEach(f -> System.out.println(f));
    }
}
