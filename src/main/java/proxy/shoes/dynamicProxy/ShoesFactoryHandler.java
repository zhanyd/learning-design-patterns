package proxy.shoes.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ShoesFactoryHandler implements InvocationHandler {

    private Object proxiedObject;

    public ShoesFactoryHandler(Object proxiedObject) {
        this.proxiedObject = proxiedObject;
    }

    /**
     * 代理类每调用一次方法就会进入这里
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        /*if(method.getName().equals("visitFactory")) {
            System.out.println("工厂禁止参观");
        }*/
        if(method.getName().equals("placeOrder")) {
            method.invoke(proxiedObject, 9000);
        }
        else if(method.getName().equals("ship")) {
            System.out.println("贴上小帅牌标签。");
            method.invoke(proxiedObject, args);
        } else {
            method.invoke(proxiedObject, args);
        }
        return null;
    }
}
