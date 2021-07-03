package flyweight.monster.normal;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 游戏场景
 */
public class GameScene {

    public static void main(String[] args) {
        List<Monster> monsterList = new ArrayList<Monster>();
        Random rand = new Random();
        for(int i = 0; i < 1000; i++) {
            monsterList.add(new Monster("飞龙","空袭", rand.nextInt() > 0 ? Monster.Color.RED : Monster.Color.BLACK, "其他数据", rand.nextInt(1000), rand.nextInt(1000)));
        }

        for(Monster monster : monsterList) {
            System.out.println(monster);
        }
    }
}
