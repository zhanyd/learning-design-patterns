package iterator.soldier.normal;

/**
 * 士兵类
 */
public class Soldier {
    /**
     * 姓名
     */
    String name;
    /**
     * 兵种
     */
    String unit;
    /**
     * 所属
     */
    String belongs;

    public Soldier(String name, String unit, String belongs) {
        this.name = name;
        this.unit = unit;
        this.belongs = belongs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getBelongs() {
        return belongs;
    }

    public void setBelongs(String belongs) {
        this.belongs = belongs;
    }

    @Override
    public String toString() {
        return "姓名：" + name + ", 兵种：" + unit + ", 所属：" + belongs;
    }
}
