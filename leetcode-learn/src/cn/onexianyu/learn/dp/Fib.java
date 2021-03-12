package cn.onexianyu.learn.dp;

/**
 * @author H
 * @data 2020/7/2.
 */

public class Fib {

    /**
     * 递归 自顶向下
     * @param n
     * @return
     */
    public static int fib(int n){
        if(n == 1 || n == 2){
            return 1;
        }
        return fib(n-1) + fib(n -2);
    }

    /**
     * 备忘录 自顶向下
     * @param back
     * @param n
     * @return
     */
    public static int fibback(int[] back,int n){
        if(n == 1 || n == 2){
            return 1;
        }
        if(back[n] != 0){
            return back[n];
        }
        back[n] = fibback(back, n-1) + fibback(back, n - 2);
        return back[n];
    }

    /**
     * dptable 自底向上
     * @return
     */
    public static int fibDpTable(int n){
        int[] table = new int[n + 1];
        table[1] = table[2] =1;
        for(int i = 3;i <= n;i++){
            table[i] = table[i-1] + table[i-2];
        }
        return table[n];
    }

    /**
     *  空间复杂度为O(1)
     * @param n
     * @return
     */
    public static int fibchange(int n){
        if(n == 1 || n == 2){
            return 1;
        }
        int curr =1,prev = 1;
        for(int i = 3;i <= n;i++){
            int sum = curr + prev;
            prev = curr;
            curr = sum;
        }
        return curr;
    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        System.out.println(fib(25));
        System.out.println("耗时：" + (System.currentTimeMillis() - startTime));
        System.out.println(fibback(new int[26],25 ));
        long startTime1 = System.currentTimeMillis();
        System.out.println("耗时：" + (System.currentTimeMillis() - startTime1));
        System.out.println(fibDpTable(25));
        long startTime2 = System.currentTimeMillis();
        System.out.println("耗时：" + (System.currentTimeMillis() - startTime2));
    }
}
