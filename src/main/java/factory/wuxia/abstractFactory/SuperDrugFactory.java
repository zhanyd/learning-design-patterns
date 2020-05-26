package factory.wuxia.abstractFactory;

public class SuperDrugFactory implements IDrugFactory{

    /**
     * 生产超级药品
     * @param type
     * @return
     */
    public Drug createDrug(String type) {

        Drug drug = null;

        // 生产超级药品
        if ("行军丹".equals(type)) {
            drug = new SuperXingJunDanDrug();
        } else if ("金疮药".equals(type)) {
            drug = new SuperJinChuangYaoDrug();
        } else if ("黑玉断续膏".equals(type)) {
            drug = new SuperHeiYuDuanXuGaoDrug();
        }

        return drug;
    }
}
