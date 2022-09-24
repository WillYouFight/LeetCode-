package LeetCode;

/**
 * project : Bootcamp1
 * package : LeetCode
 * author  : Allamuradov Tal'at
 * date    : 22.09.2022_11:20
 */
public class LeetCode908SmallestRangeI {
    public static void main(String[] args) {
        int []a={1};
        int b=0;
        System.out.println(smallestRangeI(a, b));
        int []c={0,10};
        int d=2;
        System.out.println(smallestRangeI(c, d));
    }
    public static int smallestRangeI(int[] nums, int k) {
        if (nums.length == 1) return 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i]>max) max = nums[i];
            if (nums[i]<min) min = nums[i];
        }
        return Math.max(((max - k) - (min + k)), 0);
    }
}
