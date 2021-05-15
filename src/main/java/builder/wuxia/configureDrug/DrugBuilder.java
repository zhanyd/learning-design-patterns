package builder.wuxia.configureDrug;

public class DrugBuilder {

    /**
     * 药品名称
     */
    public String name;

    /**
     * 治疗类型(0:治疗内伤；1：治疗外伤）
     */
    public int type;

    /**
     * 口味(1:甜味；2：咸味）
     */
    public int taste;

    /**
     * 药品颗粒尺寸(单位cm)
     */
    public int size;

    /**
     * 数量
     */
    public int num;


    /**
     * 构建药品对象
     * @return
     */
    public Drug build() {

        if(size < 1 || size > 5) {
            throw new IllegalArgumentException("药品颗粒尺寸必须在1-5cm之间");
        }

        if(num < 1 || size > 10) {
            throw new IllegalArgumentException("药品数量必须在1-10之间");
        }

        return new Drug(this);
    }

    /**
     * 设置名称
     * @param name
     * @return
     */
    public DrugBuilder setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 设置治疗类型
     * @param type
     * @return
     */
    public DrugBuilder setType(int type) {
        this.type = type;
        return this;
    }

    /**
     * 设置口味
     * @param taste
     * @return
     */
    public DrugBuilder setTaste(int taste) {
        this.taste = taste;
        return this;
    }

    /**
     * 设置尺寸
     * @param size
     * @return
     */
    public DrugBuilder setSize(int size) {
        this.size = size;
        return this;
    }

    /**
     * 设置数量
     * @param num
     * @return
     */
    public DrugBuilder setNum(int num) {
        this.num = num;
        return this;
    }
}
