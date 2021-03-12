package cn.onexianyu.learn.args4.sort;

/**
 * @author H
 * @data 2021/3/11.
 */

/**
 * 选择排序 找到数组中最小的那个元素与第一个元素交换位置，然后在除开第一个元素的剩余数组中找到最小的元素，与第二个元素交换位置，如此反复，直到最后一个原素
 */
public class SelectSort extends AbstractSort {

    @Override
    public void sort(Comparable[] t) {
        for(int i = 0; i < t.length-1; i++){
            int min = i;
            for(int j = i + 1; j < t.length; j++){
                if(less(t[j],t[min])){
                    min = j;
                }
            }
            exch(t,i,min);
        }
    }
}
