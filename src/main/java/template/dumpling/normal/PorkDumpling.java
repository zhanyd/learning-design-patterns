package template.dumpling.normal;

/**
 * 猪肉馅饺子
 */
public class PorkDumpling {
    /**
     * 做饺子
     */
    public void makeDumpling() {
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
        // 加其他调料
        jiaQiTaTiaoLiao();
    }

    // 擀面皮
    public void ganMianPi() {
        System.out.println("擀面皮");
    }

    // 包馅
    public void baoXian() {
        System.out.println("包猪肉馅");
    }

    // 水煮
    public void shuiZhu() {
        System.out.println("水煮10分钟");
    }

    // 出锅
    public void chuGuo() {
        System.out.println("出锅");
    }

    // 加基本调料
    public void jiaJiBenTiaoLiao() {
        System.out.println("加醋");
    }

    // 加其他调料
    public void jiaQiTaTiaoLiao() {
        System.out.println("加重辣");
    }
}
