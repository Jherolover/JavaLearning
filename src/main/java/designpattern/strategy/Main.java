package designpattern.strategy;

public class Main {

    public static void main(String[] args) {

        Person [] a = {new Person(12),new Person(18),new Person(15)};

//        for(int i = 0; i < a.length;i++){
//            for ( int j =  i+1; j < a.length;j++){
//                if( a[i].getAge() < a[j].getAge() ){
//                    //交换位置
//                    swap(a[i],a[j]);
//                }
//            }
//        }


        //Sorter<Person> sorter = new Sorter<>();

        //sorter.sort(a,new PersonComparator());
        for (int i = 0 ; i < a.length;i++){
            System.out.println(a[i].toString());
    }

    }
    /**
     * 交换位置
     * @param t1
     * @param t2
     */
    public static void swap(Person t1,Person t2){
        Person temp = t1;
        t1 = t2;
        t2 = temp;
    }
}
