package builder.wuxia.drug;

/**
 * 药品建造接口
 */
public interface DrugBuilder {

    /**
     * 混合
     */
    public void mix();

    /**
     * 浸泡
     */
    public void soak();

    /**
     * 加入秘药
     */
    public void addSecretMedicine();

    /**
     * 炼制
     */
    public void refine();

    /**
     * 晾晒
     */
    public void dry();

    /**
     * 密封
     */
    public void seal();
}
