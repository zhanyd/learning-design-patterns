package factory.wuxia.factory;

public class Drugstore {

    /**
     * 药房接到订单生产药品
     * @param type
     * @return
     */
    public Drug orderDrug(String type) {

        IDrugFactory drugFactory = null;
        Drug drug = null;

        System.out.println("接到订单：" + type);

        // 获取对应的工厂
        if ("行军丹".equals(type)) {
            drugFactory = new XingJunDanDrugFactory();
        } else if ("金疮药".equals(type)) {
            drugFactory = new JinChuangYaoDrugFactory();
        } else if ("黑玉断续膏".equals(type)) {
            drugFactory = new HeiYuDuanXuGaoDrugFactory();
        } else if ("灵葫仙丹".equals(type)) {
            drugFactory = new LinHuXianDanDrugFactory();
        }

        // 生产对应的药品
        drug = drugFactory.createDrug();

        // 打包药品
        drug.packing();

        return drug;

    }

}
