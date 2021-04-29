package proxy.shoes.access;

public class Client {
    public static void main(String[] args) {
        IShoesFactory factory = new ShoesFactory("刘望星的工厂");
        IShoesFactory factoryProxy = new ShoesFactoryProxy(factory);
        // 参观工厂
        factoryProxy.visitFactory();
        // 下订单
        factoryProxy.placeOrder(10000);
        // 发货
        factoryProxy.ship();
    }
}
