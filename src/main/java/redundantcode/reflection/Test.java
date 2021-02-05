package redundantcode.reflection;


import org.springframework.beans.BeanUtils;

public class Test {
    public static void main(String[] args) {
        String a= "abnc";
        String b = String.format("%20s",a).replace(" ","_");
        String c = String.format("%015d",1523122);
        System.out.println(c);
        //BeanUtils
        //BeanUtils.copyProperties();
    }
}
