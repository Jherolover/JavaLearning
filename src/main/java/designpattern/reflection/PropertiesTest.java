package designpattern.reflection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {

    public static void main(String[] args) throws IOException {
        //获取属性类
        Properties p = new Properties();
        //
        p.load(new FileInputStream("F:\\Java\\src\\main\\java\\designpattern\\reflection\\properties"));
        String shape = p.getProperty("shape");
        System.out.println(shape);
    }
}
