package cn.onexianyu.learn.args4.sort;

/**
 * @author H
 * @data 2021/3/11.
 */

/**
 * 将数组中的元素依次插入到前面已经排序好的数组中。类似于斗地主整理扑克牌的顺序
 */
public class InsertSort extends AbstractSort{


    @Override
    public void sort(Comparable[] t) {
        for(int i = 1; i < t.length; i ++){
            for(int j = i ; j > 0 && less(t[j],t[j-1]);j--){
                exch(t,j,j-1);
            }
        }
    }
}
