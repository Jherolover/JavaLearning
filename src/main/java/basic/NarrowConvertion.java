package basic;

public class NarrowConvertion
{
    public static void main(String[] args) {
        int iValue = 233;
        byte by  = (byte) iValue;
        System.out.println(by);
        //
        double dValue = 2.345;
        int intValue = (int) dValue;
        System.out.println(intValue);
        
    }
}
