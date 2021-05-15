package builder.wuxia.configureDrug;

/**
 * 药品类
 */
public class Drug {

    /**
     * 药品名称
     */
    private String name;

    /**
     * 治疗类型(0:治疗内伤；1：治疗外伤）
     */
    private int type;

    /**
     * 口味(1:甜味；2：咸味）
     */
    private int taste;

    /**
     * 药品颗粒尺寸(单位cm)
     */
    private int size;

    /**
     * 数量
     */
    private int num;

    /**
     * 构造方法，通过Builder类的属性来构造对象
     * @param drugBuilder
     */
    public Drug(DrugBuilder drugBuilder) {
        this.name = drugBuilder.name;
        this.type = drugBuilder.type;
        this.taste = drugBuilder.taste;
        this.size = drugBuilder.size;
        this.num = drugBuilder.num;
    }

    @Override
    public String toString() {
        StringBuffer display = new StringBuffer();
        display.append("---- 您获得了药品：" + name + " ----\n");
        display.append("能够治疗：" + (type == 0 ? "内伤" : "外伤") + "\n");
        display.append("口味：" + (taste == 0 ? "甜味" : "咸味") + "\n");
        display.append("颗粒尺寸：" + size + "cm\n");
        display.append("数量：" + num + "颗\n");
        return display.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getTaste() {
        return taste;
    }

    public void setTaste(int taste) {
        this.taste = taste;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
