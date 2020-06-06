package template.dumpling.template;

/**
 * 韭菜馅饺子
 */
public class LeekDumpling extends Dumpling{

    /**
     * 包馅
     */
    @Override
    public void baoXian() {
        System.out.println("包韭菜馅");
    }

    /**
     * 水煮
     */
    @Override
    public void shuiZhu() {
        System.out.println("水煮8分钟");
    }
}
