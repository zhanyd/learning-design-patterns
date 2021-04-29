package proxy.shoes.access;

/**
 * 代理鞋厂类
 */
public class ShoesFactoryProxy implements IShoesFactory {

    private IShoesFactory shoesFactory;

    public ShoesFactoryProxy(IShoesFactory shoesFactory) {
        this.shoesFactory = shoesFactory;
    }

    /**
     * 参观工厂
     */
    @Override
    public void visitFactory() {
        System.out.println("工厂禁止参观");
        // shoesFactory.visitFactory();
    }

    /**
     * 下订单
     *
     * @param price 金额
     */
    @Override
    public void placeOrder(double price) {
        shoesFactory.placeOrder(price * 0.9);
    }

    /**
     * 发货
     */
    @Override
    public void ship() {
        System.out.println("贴上小帅牌标签。");
        shoesFactory.ship();
    }
}
