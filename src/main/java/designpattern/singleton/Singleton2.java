package designpattern.singleton;

/**
 * 懒汉式
 */
public class Singleton2 {

    private Singleton2 INSTANCE = null;

    private Singleton2(){};

    /**
     * 获取实例
     */
    public Singleton2 getInstance(){
        if(INSTANCE == null){
            INSTANCE = new Singleton2();
        }else{
            return INSTANCE;
        }
        return INSTANCE;
    }
}
