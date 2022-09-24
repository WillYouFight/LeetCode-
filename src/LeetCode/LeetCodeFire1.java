package LeetCode;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * project : Bootcamp1
 * package : LeetCode
 * author  : Allamuradov Tal'at
 * date    : 10.09.2022_21:58
 */
public class LeetCodeFire1 {
    public static void main(String[] args) {
        int []a={3,2,6,5,0,3};
        System.out.println(maxProfit(a, 2));
    }
    public static int maxProfit(int []price,int k) {//[3,2,6,5,0,3]// k = kun
        if (k == 0) return 0;
        int[] buy = new int[k];
        int[] sell = new int[k];
        Arrays.fill(buy, Integer.MIN_VALUE);
        Arrays.fill(sell, 0);
        for (int i = 0; i < price.length; i++) {
            buy[0] = Math.max(buy[0], price[i] * -1);//buy[0]=-3
            sell[0] = Math.max(sell[0], buy[0] + price[i]);//(buy[0]=-3;price[0]=3;){-3+3=0}sell[0]=0
            for (int j = 1; j < k; j++) {
                buy[j] = Math.max(buy[j], sell[j - 1] - price[i]);//buy[1]=-2
                sell[j] = Math.max(sell[j], buy[j] + price[i]);//sell[1]=0
            }
        }
        return sell[k-1];
    }
}
