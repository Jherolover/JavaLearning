package juc;

/**
 * synchronized
 * 对某个对象进行加锁
 * 共享资源需要进行加锁
 * @冻结库存等
 * @冻结余额等
 */
public class JUC001 {

    private int count = 10;
    private Object object = new Object();

    private void m(){
        synchronized (object){
            count--;
            System.out.println(Thread.currentThread().getName()+":count="+count);

        }
    }
}
