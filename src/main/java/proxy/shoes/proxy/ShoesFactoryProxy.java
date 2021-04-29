package proxy.shoes.proxy;

/**
 * 代理鞋厂类
 */
public class ShoesFactoryProxy implements IShoesFactory{

    private IShoesFactory shoesFactory;

    public ShoesFactoryProxy(IShoesFactory shoesFactory) {
        this.shoesFactory = shoesFactory;
    }

    /**
     * 参观工厂
     */
    @Override
    public void visitFactory() {
        shoesFactory.visitFactory();
    }

    /**
     * 下订单
     *
     * @param price 金额
     */
    @Override
    public void placeOrder(double price) {
        shoesFactory.placeOrder(price);
    }

    /**
     * 发货
     */
    @Override
    public void ship() {
        shoesFactory.ship();
    }
}
