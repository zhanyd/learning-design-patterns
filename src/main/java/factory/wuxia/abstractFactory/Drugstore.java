package factory.wuxia.abstractFactory;

public class Drugstore {

    /**
     * 药房接到订单生产药品
     * @param type
     * @return
     */
    public Drug orderDrug(String type, boolean isVip) {

        IDrugFactory drugFactory = null;

        if(isVip) {
            drugFactory = new SuperDrugFactory();
            System.out.println("接到VIP订单：" + type + " 切换超级工厂");
        } else {
            drugFactory = new NormalDrugFactory();
            System.out.println("接到普通订单：" + type + " 切换普通工厂");
        }

        Drug drug = null;

        // 通过工厂生产药品
        drug = drugFactory.createDrug(type);

        // 打包药品
        drug.packing();

        return drug;

    }

}
