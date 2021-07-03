package flyweight.monster.normal;

/**
 * 怪物类
 */
public class Monster {

    public static enum Color {
        RED, BLACK;
    }

    /**
     * 名称
     */
    private String name;
    /**
     * 技能
     */
    private String skill;
    /**
     * 颜色
     */
    private Color color;

    /**
     * 其他数据
     */
    private String otherData;

    /**
     * x坐标
     */
    private int x;

    /**
     * y坐标
     */
    private int y;

    public Monster(String name, String skill, Color color, String otherData, int x, int y) {
        this.name = name;
        this.skill = skill;
        this.color = color;
        this.otherData = otherData;
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "怪物名称：" + name + "，技能：" + skill + "，颜色：" + color + ", 其他数据：" + otherData + "，x坐标：" + x + "，y坐标：" + y;
    }
}
