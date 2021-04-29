package proxy.shoes.dynamicProxy;

import java.lang.reflect.Proxy;

public class ShoesFactoryProxy {
    /**
     * 生成动态代理
     * @param proxiedObject
     * @return
     */
    public Object createProxy(Object proxiedObject) {
        Class[] interfaces = proxiedObject.getClass().getInterfaces();
        ShoesFactoryHandler handler = new ShoesFactoryHandler(proxiedObject);
        return Proxy.newProxyInstance(proxiedObject.getClass().getClassLoader(), interfaces, handler);
    }
}
