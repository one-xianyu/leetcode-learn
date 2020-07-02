package cn.onexianyu.learn.dp;

import java.util.HashMap;
import java.util.Map;

/**
 * @author H
 * @data 2020/7/2.
 */
public class CoinChange {

    public static int coinChange(int[] coins,int amount){
        if(amount == 0){
            return 0;
        }
        if(amount < 0){
            return -1;
        }
        int res = Integer.MAX_VALUE;
        for(int coin : coins){
            int subproblem = coinChange(coins, amount-coin);
            if(subproblem == -1){
                continue;
            }
            res = Math.min(res,1+subproblem);
        }
        return res;
    }

    /**
     * 带备忘录
     * @param coins
     * @param amount
     * @return
     */
    public static int coinChangeback(int[] coins, int amount, Map<Integer,Integer> back){
        if(amount == 0){
            return 0;
        }
        if(amount < 0){
            return -1;
        }
        if(back.containsKey(amount)){
            return back.get(amount);
        }
        int res = Integer.MAX_VALUE;
        for(int coin : coins){
            int subproblem = coinChangeback(coins, amount-coin,back);
            if(subproblem == -1){
                continue;
            }
            res = Math.min(res,1+subproblem);
        }
        back.put(amount,res);
        return res;
    }
    public static void main(String[] args) {
        System.out.println(coinChange(new int[]{1,2,5},17));
        System.out.println(coinChangeback(new int[]{1,2,5},17,new HashMap<>()));
    }
}
