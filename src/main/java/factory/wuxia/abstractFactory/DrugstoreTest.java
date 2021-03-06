package factory.wuxia.abstractFactory;

public class DrugstoreTest {

    public static void main(String[] args) {

        // 是否vip客户
        boolean isVip = true;
        Drugstore drugstore = new Drugstore();
        System.out.println("为保证品质，本店所有药品只接受预定：");
        System.out.println();

        // 药房接到行军丹订单
        Drug drug = drugstore.orderDrug("行军丹", isVip);
        System.out.println(drug);

        // 药房接到金疮药订单
        drug = drugstore.orderDrug("金疮药", isVip);
        System.out.println(drug);

        // 药房接到黑玉断续膏订单
        drug = drugstore.orderDrug("黑玉断续膏", isVip);
        System.out.println(drug);

    }
}
