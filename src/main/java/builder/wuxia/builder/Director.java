package builder.wuxia.builder;

/**
 * 导演类
 */
public class Director {

    /**
     * 建造药品
     * @param drugBuilder
     */
    public void constructDrug(DrugBuilder drugBuilder) {
        // 混合
        drugBuilder.mix();
        // 浸泡
        drugBuilder.soak();
        // 加入秘药
        drugBuilder.addSecretMedicine();
        // 炼制
        drugBuilder.refine();
        // 晾晒
        drugBuilder.dry();
        // 密封
        drugBuilder.seal();
    }
}
