package flyweight.monster.flyweight;

/**
 * 怪物
 */
public class Monster {
    /**
     * 怪物单位
     */
    private MonsterUnit monsterUnit;
    /**
     * x坐标
     */
    private int x;
    /**
     * y坐标
     */
    private int y;

    public Monster(MonsterUnit monsterUnit, int x, int y) {
        this.monsterUnit = monsterUnit;
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "怪物名称：" + monsterUnit.name + "，技能：" + monsterUnit.skill + "，颜色：" + monsterUnit.color + ", 其他数据：" + monsterUnit.otherData + "，x坐标：" + x + "，y坐标：" + y;
    }

}
