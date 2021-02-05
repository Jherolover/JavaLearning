package juc;

/**
 * 静态方法同步
 */
public class JUC003 {
    private static  int count = 10;

    public static  void m(){
        synchronized (JUC003.class){
            count --;
            System.out.println(Thread.currentThread().getName()+" count="+count);
        }
    }
    /**
     * 方法中加synchronized
     */
    public synchronized static  void m1(){
        count -- ;
        System.out.println(Thread.currentThread().getName()+" count="+count);
    }
}
