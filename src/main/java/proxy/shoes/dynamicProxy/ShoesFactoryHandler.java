package proxy.shoes.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ShoesFactoryHandler implements InvocationHandler {

    /**
     * 被代理的对象，实际的方法执行者
     */
    private Object proxiedObject;

    public ShoesFactoryHandler(Object proxiedObject) {
        this.proxiedObject = proxiedObject;
    }

    /**
     * 代理类每调用一次方法就会进入这里
     * @param proxy 表示代理对象本身，需要注意，它不是被代理的对象
     * @param method 表示正在被调用的方法
     * @param args 表示方法的参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        /*if(method.getName().equals("visitFactory")) {
            System.out.println("工厂禁止参观");
        }*/
        if(method.getName().equals("placeOrder")) {
            // 如果是下订单方法，给代工厂9折的价格
            method.invoke(proxiedObject, Double.parseDouble(String.valueOf(args[0])) * 0.9);
        }
        else if(method.getName().equals("ship")) {
            // 如果是发货方法，发货之前先贴上标签
            System.out.println("贴上小帅牌标签");
            method.invoke(proxiedObject, args);
        } else {
            // 其他方法，直接调用
            method.invoke(proxiedObject, args);
        }
        return null;
    }
}
