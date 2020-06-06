package template.dumpling.template;

/**
 * 猪肉馅饺子
 */
public class PorkDumpling extends Dumpling{

    /**
     * 包馅
     */
    @Override
    public void baoXian() {
        System.out.println("包猪肉馅");
    }

    /**
     * 水煮
     */
    @Override
    public void shuiZhu() {
        System.out.println("水煮10分钟");
    }


    /**
     * 覆盖hook()方法，加其他调料
     */
    @Override
    public void hook() {
        System.out.println("加重辣");
    }
}
