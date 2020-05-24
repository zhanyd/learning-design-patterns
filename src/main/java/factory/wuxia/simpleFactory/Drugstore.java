package factory.wuxia.simpleFactory;

public class Drugstore {

    /**
     * 药房接到订单生产药品
     * @param type
     * @return
     */
    public Drug orderDrug(String type) {

        Drug drug = null;

        System.out.println("接到订单：" + type);

        // 通过工厂生产药品
        drug = SimpleDrugFactory.createDrug(type);

        // 打包药品
        drug.packing();

        return drug;

    }

}
