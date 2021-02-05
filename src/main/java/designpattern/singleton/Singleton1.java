package designpattern.singleton;

/**
 * 饿汉式
 * 初始化直接加载在内存中 不管用与否
 */
public class Singleton1 {
    private static Singleton1 INSTANCE = new Singleton1();
    //私有化构造器
    private Singleton1(){};
    //提供一个获取实例的方法
    public static  Singleton1 getInstance(){
        return  INSTANCE;
    }

    public static void main(String[] args) {
        Singleton1  s = Singleton1.getInstance();
        Singleton1 s2 = Singleton1.getInstance();
        System.out.println(s == s2);
    }
}
