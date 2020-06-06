package template.dumpling.template;

public abstract class Dumpling {

    /**
     * 做饺子
     */
    public final void makeDumpling() {
        // 擀面皮
        ganMianPi();
        // 包馅
        baoXian();
        // 水煮
        shuiZhu();
        // 出锅
        chuGuo();
        // 加基本调料
        jiaJiBenTiaoLiao();
        // 钩子
        hook();
    }

    /**
     * 擀面皮
     */
    public void ganMianPi() {
        System.out.println("擀面皮");
    }

    /**
     * 包馅
     */
    public abstract void baoXian();

    /**
     * 水煮
     */
    public abstract void shuiZhu();

    /**
     * 出锅
     */
    public void chuGuo() {
        System.out.println("出锅");
    }

    /**
     * 加基本调料
     */
    public void jiaJiBenTiaoLiao() {
        System.out.println("加醋");
    }

    /**
     * 钩子（自定义扩展方法）
     */
    public void hook() {
    }

}
