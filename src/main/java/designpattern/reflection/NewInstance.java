package designpattern.reflection;

import java.lang.reflect.Constructor;

public class NewInstance {
    
    private Integer m;
    
    private String name;
    //无参数构造器
    public  NewInstance(){};

    //有两个参数构造器
    public NewInstance(Integer m ,String name){
        this.m  = m ;
        this.name = name;
    }
    //有一个参数的构造器
    public NewInstance(Integer m){
        this.m = m;
    }

    @Override
    public String toString() {
        return "NewInstance{" +
                "m=" + m +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) throws Exception{

        Class clazz  = Class.forName("designpattern.reflection.NewInstance");
       //获取构造器创建实例
        //获取构造器
        Object o = clazz.getConstructor().newInstance();
//        c.newInstance(new Class[]{Integer.class});
//        Object o = c.newInstance(new Object[]{12});
        Object o1 = clazz.getConstructor(new Class[]{Integer.class}).newInstance(new Object[]{12});
        Object o2 = clazz.getConstructor(new Class[]{Integer.class, String.class}).newInstance(new Object[]{18, "hello"});

        System.out.println(o2.toString());
    }
}
