package factory.wuxia.abstractFactory;


public class NormalDrugFactory implements IDrugFactory {

    /**
     * 生产普通药品
     * @param type
     * @return
     */
    public Drug createDrug(String type) {

        Drug drug = null;

        // 生产药品
        if ("行军丹".equals(type)) {
            drug = new XingJunDanDrug();
        } else if ("金疮药".equals(type)) {
            drug = new JinChuangYaoDrug();
        } else if ("黑玉断续膏".equals(type)) {
            drug = new HeiYuDuanXuGaoDrug();
        }

        return drug;
    }
}
