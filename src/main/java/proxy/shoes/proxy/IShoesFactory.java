package proxy.shoes.proxy;

/**
 * 鞋厂接口
 */
public interface IShoesFactory {

    /**
     * 参观工厂
     */
    void visitFactory();

    /**
     * 下订单
     * @param price 金额
     */
    void placeOrder(double price);

    /**
     * 发货
     */
    void ship();
}
