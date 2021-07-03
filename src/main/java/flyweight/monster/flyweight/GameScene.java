package flyweight.monster.flyweight;
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
        // 怪物
        Monster monster;
        // 红色怪物单位
        MonsterUnit redMonsterUnit;
        // 黑色怪物单位
        MonsterUnit blackMonsterUnit;
        // 获取红色怪物单位
        redMonsterUnit = MonsterUnitFactory.getMonsterUnit("飞龙","空袭", MonsterUnit.Color.RED , "其他数据");
        // 获取黑色怪物单位
        blackMonsterUnit = MonsterUnitFactory.getMonsterUnit("飞龙","空袭", MonsterUnit.Color.BLACK, "其他数据");
        for(int i = 0; i < 1000; i++) {
            // 怪物单位加上坐标生产怪物对象
            monster = new Monster(rand.nextInt() > 0 ? redMonsterUnit : blackMonsterUnit, rand.nextInt(1000), rand.nextInt(1000));
            monsterList.add(monster);
        }

        for(Monster item : monsterList) {
            System.out.println(item);
        }
    }
}
