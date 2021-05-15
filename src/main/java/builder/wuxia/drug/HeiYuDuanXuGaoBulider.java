package builder.wuxia.drug;

/**
 * 黑玉断续膏建造者类
 */
public class HeiYuDuanXuGaoBulider implements DrugBuilder{

    private Drug drug;

    public HeiYuDuanXuGaoBulider() {
        this.drug = new Drug("黑玉断续膏");
    }

    /**
     * 混合
     */
    @Override
    public void mix() {
        this.drug.setMixed(true);
    }

    /**
     * 浸泡
     */
    @Override
    public void soak() {
        this.drug.setSoakd(true);
    }

    /**
     * 加入秘药
     */
    @Override
    public void addSecretMedicine() {
        this.drug.setHasSecretMedicine(true);
    }

    /**
     * 炼制
     */
    @Override
    public void refine() {
        this.drug.setRefine(true);
    }

    /**
     * 晾晒
     */
    @Override
    public void dry() {
        this.drug.setDry(true);
    }

    /**
     * 密封
     */
    @Override
    public void seal() {
        this.drug.setSeal(true);
    }

    /**
     * 获取药品
     * @return
     */
    public Drug getResult() {
        return this.drug;
    }
}
