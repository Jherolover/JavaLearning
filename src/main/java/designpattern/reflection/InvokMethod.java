package designpattern.reflection;


import java.lang.reflect.Method;

public class InvokMethod {

    public void func1(){
        System.out.println("invoking func1...");
    }
    public void func2(Integer m ){
        System.out.println("invoking func2...."+m);
    }

    public void func3(String name,Integer m){
        System.out.println("invoking func3..."+name+","+m);
    }

    public static void main(String[] args) throws Exception{

        //获取对象的实例
        Class clazz = Class.forName("designpattern.reflection.InvokMethod");
        //生成实例对象
        Object o = clazz.getConstructor().newInstance();
        //获取实例的方法
        Method method1 = clazz.getMethod("func1");
        //执行方法
        method1.invoke(o);
        Method method2 = clazz.getMethod("func2", Integer.class);
        method2.invoke(o,new Object[]{10});

        Method method3 = clazz.getMethod("func3", String.class, Integer.class);
        method3.invoke(o,new Object[]{"tom",12});

    }
}
