package flyweight.monster.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 怪物单位工厂
 */
public class MonsterUnitFactory {

    private static final Map<String, MonsterUnit> monsters = new HashMap<>();

    /**
     * 获取怪物单位
     * @param name
     * @param skill
     * @param color
     * @param otherData
     * @return
     */
    public static MonsterUnit getMonsterUnit(String name, String skill, MonsterUnit.Color color, String otherData) {
        // 用怪物的名称和颜色作为map的key，每种颜色的怪物复用一个对象
        MonsterUnit monsterUnit = monsters.get(name + color);
        if(monsterUnit == null) {
            monsterUnit = new MonsterUnit(name, skill, color, otherData);
            monsters.put(name + color, monsterUnit);
        }
        return monsterUnit;
    }
}
