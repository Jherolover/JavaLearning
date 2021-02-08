package sort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int [] ns = {28,12,89,73,65,18,96};
        System.out.println("排序前....："+ Arrays.toString(ns));

        for (int i = 0 ; i < ns.length;i++){
            for(int j = 0 ; j < ns.length - i - 1;j++){
                if( ns[j] > ns[j+1]){
                    //交换数组位置
                    int tmp = ns[j];
                    ns[j] = ns[j+1];
                    ns[j+1] = tmp;
                }
            }
        }
        //排序后
        System.out.println("排序后...:"+Arrays.toString(ns));
    }
}
