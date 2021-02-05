package designpattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class InvokCount implements InvocationHandler {

   private  int count;

   //代理对象
   private Object obj;

    public InvokCount(Object obj) {
        this.obj = obj;
    }

    //核心执行方法
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

         count ++ ;
         method.invoke(obj,args);
        return null;
    }
}
