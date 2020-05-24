package factory.wuxia.normal;

abstract public class Drug {

    /**
     * 药品名称
     */
    String name;

    /**
     * 功效
     */
    String efficacy;


    public void packing() {
        System.out.println("打包药品：" + name);
    }

    @Override
    public String toString() {
        // 药丸的功效
        StringBuffer display = new StringBuffer();
        display.append("---- " + name + " 使用说明 ----\n");
        display.append("具有功效：" + efficacy + "\n");
        return display.toString();
    }
}
