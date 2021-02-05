package designpattern.strategy;

public class PersonComparator implements Comparator<Person> {
    /**
     * @param p1
     * @param p2
     * @return
     */
    @Override
    public int Compare(Person p1, Person p2) {
        if(p1.getAge() < p2.getAge()) {
            return 1;
        }else if(p1.getAge() > p2.getAge()) {
            return -1;
        }else {
            return 0;
        }
    }
}
