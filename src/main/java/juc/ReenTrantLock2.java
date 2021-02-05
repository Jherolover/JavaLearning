package juc;

import java.util.Locale;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * try
 *
 * finally
 *
 * unlocked
 */
public class ReenTrantLock2 {
    Lock lock = new ReentrantLock();

    void m1(){
        lock.lock();
        try{
            for(int i = 0 ; i < 10;i++){
                System.out.println(Thread.currentThread().getName()+"i="+i);
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        } finally {
            lock.unlock();
        }
    }

}
