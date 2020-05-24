package factory.wuxia.normal;

public class Drugstore {

    /**
     * 药房接到订单生产药品
     * @param type
     * @return
     */
    public Drug orderDrug(String type) {

        Drug drug = null;

        System.out.println("接到订单：" + type);

        // 生产药品
        if("行军丹".equals(type)) {
            drug = new XingJunDanDrug();
        } else if("金疮药".equals(type)) {
            drug = new JinChuangYaoDrug();
        } else if("黑玉断续膏".equals(type)) {
            drug = new HeiYuDuanXuGaoDrug();
        } else if("灵葫仙丹".equals(type)) {
            drug = new LinHuXianDanDrug();
        }

        // 打包药品
        drug.packing();

        return drug;
    }
}
