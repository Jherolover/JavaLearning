package spring.beans;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.InputStreamResource;

public class TestMain {

    public static void main(String[] args) {

        //通过配置文件获取bean
        //1.接口对象 获取bean以及bean的各种对象
        BeanFactory bf = null;
        MyTestBean testBean = (MyTestBean) bf.getBean("testBean");
        //



    }
}
