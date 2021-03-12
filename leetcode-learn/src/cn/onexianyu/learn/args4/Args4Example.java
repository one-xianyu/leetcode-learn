package cn.onexianyu.learn.args4;

/**
 * @author H
 * @data 2021/3/5.
 */
public class Args4Example {

    public int gcd(int p, int q){
        if(q == 0 ){
            return p;
        }
        int n = p % q;
        return gcd(q,n);
    }

    public static void main(String[] args) {
        System.out.println(new Args4Example().gcd(345,65));
    }
}
