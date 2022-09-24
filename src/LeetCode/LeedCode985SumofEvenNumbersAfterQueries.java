package LeetCode;

import java.util.Arrays;

/**
 * project : Bootcamp1
 * package : LeetCode
 * author  : Allamuradov Tal'at
 * date    : 21.09.2022_14:41
 */
public class LeedCode985SumofEvenNumbersAfterQueries {
    public static void main(String[] args) {
        int []a={1,2,3,4};
        int [][]b={ {1,0},
                   {-3,1},
                   {-4,0},
                   {2,3}};
        System.out.println(Arrays.toString(sumEvenAfterQueries(a, b)));
        int []c={1};
        int [][]d={{4,0}};
        System.out.println(Arrays.toString(sumEvenAfterQueries(c,d)));
    }
    public static int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int arr[] = new int[nums.length];
        int sum = sumOfArray(nums);
        int i=0;
        for(int query[]:queries)
        {
            if(nums[query[1]]%2==0) {
                sum-=nums[query[1]];
            }
            nums[query[1]]+=query[0];
            if(nums[query[1]]%2==0) {
                sum+=(nums[query[1]]);
            }
            arr[i++]=sum;
        }
        return arr;
    }
    public static int sumOfArray(int arr[])
    {
        int sum=0;
        for(int a:arr)
        {
            if(a%2==0)
                sum+=a;
        }
        return sum;
    }
}
