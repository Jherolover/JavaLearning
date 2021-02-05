package designpattern.strategy;

public class Sorter<T> {

   //sort
    public void sort(T[] arr,Comparator<T> comparator){

        /**
         * for循环两次进行对比
         */
        for(int i = 0; i < arr.length;i++){
            for ( int j =  i+1; j < arr.length;j++){
                if( comparator.Compare(arr[i],arr[j]) < 0 ){
                    //交换位置
                    swap(arr,i,j);
                }
            }
        }
    }

    /**
     * 交换位置
     * @param t1
     * @param t2
     */
    public void swap(T[]arr,int i,int j){
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
