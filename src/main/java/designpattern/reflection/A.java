package designpattern.reflection;

import javax.sound.midi.Soundbank;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class A {

    int m;
    public A(){};

    public A(int m){
        this.m = m;
    }
    private void func1(){

    }
    private boolean func2(){
        return true;
    }

    public static void main(String[] args) throws Exception {
        //1.加载并初始化类
        Class clazz = Class.forName("designpattern.reflection.A");
        //获取类的构造器以及函数
        Constructor [] cons = clazz.getConstructors();
        for (int i = 0 ; i <cons.length; i ++){
            System.out.println(cons[i].toString());
        }
        //获取方法
        Method [] methods = cons.getClass().getMethods();
        for (int j = 0 ; j < methods.length; j ++){
            System.out.println(methods[j].toString());
        }

    }

}
