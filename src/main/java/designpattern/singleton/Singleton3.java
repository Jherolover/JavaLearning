package designpattern.singleton;

/**
 * 双端效验单例模式
 */
public class Singleton3 {

    private volatile Singleton3 INSTANCE = null;

    private Singleton3(){};

    public Singleton3 getInstance(){
        if( INSTANCE == null){
            synchronized (this){
                if(INSTANCE == null){
                    return new Singleton3();
                }
            }
        }else{
            return INSTANCE;
        }
        return INSTANCE;
    }

}
