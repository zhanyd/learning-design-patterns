package proxy.shoes.dynamicProxy;

/**
 * 鞋厂类
 */
public class ShoesFactory implements IShoesFactory {

    private String name;

    public ShoesFactory(String name) {
        this.name = name;
    }

    /**
     * 参观工厂
     */
    @Override
    public void visitFactory() {
        System.out.println("带客户参观" + name);
    }

    /**
     * 下订单
     *
     * @param price 金额
     */
    @Override
    public void placeOrder(double price) {
        System.out.println("接到" + price + "元的订单");
    }

    /**
     * 发货
     */
    @Override
    public void ship() {
        System.out.println("开始发货");
    }
}
