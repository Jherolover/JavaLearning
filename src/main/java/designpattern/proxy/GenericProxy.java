package designpattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class GenericProxy {

    public static  Object createProxy(Object obj, InvocationHandler invocationHandler){
        Object proxy = Proxy.newProxyInstance(obj.getClass().getClassLoader(),obj.getClass().getInterfaces(),
                invocationHandler);
        return proxy;
    }
}
