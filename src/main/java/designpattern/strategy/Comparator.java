package designpattern.strategy;

/**
 * 接口：对比两个
 */
public interface Comparator<T> {
    /**
     * 泛型对象之间的对比
     * @param o1
     * @param o2
     * @return
     */
    int Compare(T o1,T o2);

}
