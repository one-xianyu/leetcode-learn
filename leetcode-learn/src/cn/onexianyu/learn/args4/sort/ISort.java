package cn.onexianyu.learn.args4.sort;

/**
 * @author H
 * @data 2021/3/10.
 */
public interface ISort {

    boolean less(Comparable t, Comparable v);

    void exch(Comparable[] t, int i, int j);

    void show(Comparable[] t);

    boolean isSort(Comparable[] t);

    void sort(Comparable[] t);
}
