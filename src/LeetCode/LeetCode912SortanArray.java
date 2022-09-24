package LeetCode;

import java.util.Arrays;

/**
 * project : Bootcamp1
 * package : LeetCode
 * author  : Allamuradov Tal'at
 * date    : 24.09.2022_1:18
 */
public class LeetCode912SortanArray {
    public static void main(String[] args) {
        int [] a={5,2,3,1};
        System.out.println(Arrays.toString(sortArray(a)));
    }
    public static int[] sortArray(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {//2//3//1
                if (nums[i]>nums[j]){//
                    int save=nums[i];
                    int t=0;
                    t=save;//5
                    save=nums[j];//2
                    nums[j]=t;//5
                }
            }
        }
        return nums;
    }
}
