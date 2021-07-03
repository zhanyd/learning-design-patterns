package flyweight.monster.flyweight;


/**
 * 怪物单位
 */
public class MonsterUnit {

    protected static enum Color {
        RED, BLACK;
    }

    /**
     * 名称
     */
    protected String name;
    /**
     * 技能
     */
    protected String skill;
    /**
     * 颜色
     */
    protected Color color;

    /**
     * 其他数据
     */
    protected String otherData;


    public MonsterUnit(String name, String skill, Color color, String otherData) {
        this.name = name;
        this.skill = skill;
        this.color = color;
        this.otherData = otherData;
    }
}
