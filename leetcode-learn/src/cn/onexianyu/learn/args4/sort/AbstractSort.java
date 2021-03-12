package cn.onexianyu.learn.args4.sort;

/**
 * @author H
 * @data 2021/3/10.
 */
public abstract  class AbstractSort implements ISort{

    @Override
    public  boolean less(Comparable t, Comparable v) {
        return t.compareTo(v) < 0;
    }

    @Override
    public void exch(Comparable[] t, int i, int j) {
        Comparable o = t[i];
        t[i] = t[j];
        t[j] = o;
    }

    @Override
    public void show(Comparable[] t) {
        for(int i = 0; i < t.length; i++){
            System.out.print(t[i] + " ");
        }
    }

    @Override
    public boolean isSort(Comparable[] t) {
        for(int i = 1; i < t.length; i++){
            if(less(t[i],t[i-1])){
                return false;
            }
        }
        return true;
    }
}
