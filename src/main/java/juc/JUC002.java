package juc;

/**
 * 使用this锁定当前对象
 */
public class JUC002 {

    private int count = 10;

    public void m(){
        synchronized (this){
            count --;
            System.out.println(Thread.currentThread().getName()+" count="+count);
        }
    }
    /**
     * 方法中加synchronized
     */
    public synchronized  void m1(){
        count --;
        System.out.println(Thread.currentThread().getName()+" count="+count);
    }
}
