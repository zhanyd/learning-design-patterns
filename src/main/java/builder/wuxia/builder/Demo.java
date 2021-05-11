package builder.wuxia.builder;

/**
 * 客户端类
 */
public class Demo {
    public static void main(String[] args) {
        // 创建导向器类
        Director director = new Director();
        // 创建黑玉断续膏建造者类
        HeiYuDuanXuGaoBulider heiYuDuanXuGaoBulider = new HeiYuDuanXuGaoBulider();
        // 建造药品
        director.constructDrug(heiYuDuanXuGaoBulider);
        // 获取药品
        Drug drug = heiYuDuanXuGaoBulider.getResult();
        System.out.println(drug);
    }
}
