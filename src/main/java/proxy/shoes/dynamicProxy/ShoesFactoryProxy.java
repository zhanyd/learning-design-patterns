package proxy.shoes.dynamicProxy;

import java.lang.reflect.Proxy;

public class ShoesFactoryProxy {
    /**
     * 生成动态代理
     * @param proxiedObject 被代理的对象，实际的方法执行者
     * @return
     */
    public Object createProxy(Object proxiedObject) {
        // 获取对应的ClassLoader
        ClassLoader classLoader = proxiedObject.getClass().getClassLoader();
        // 获取所有的接口
        Class[] interfaces = proxiedObject.getClass().getInterfaces();
        // 创建一个传给代理类的调用请求处理器
        ShoesFactoryHandler handler = new ShoesFactoryHandler(proxiedObject);
        return Proxy.newProxyInstance(classLoader, interfaces, handler);
    }
}
