package designpattern.reflection;

import java.lang.reflect.Method;

public class CommonMethod {

    public  boolean process(String className,String funName,Object[] param) throws Exception {
        //获取类
        Class  clazz =  Class.forName(className);
        //处理参数序列
        Class [] params = new Class[param.length];
        for (int i = 0 ; i <param.length;i++){
            params[i] = param[i].getClass();
        }
        //获取执行的实例
        Object obj = clazz.getConstructor().newInstance();
        //获取方法
        Method method = clazz.getMethod(funName,params);
        //执行方法
        method.invoke(method,param);
        return true;
    }
}
