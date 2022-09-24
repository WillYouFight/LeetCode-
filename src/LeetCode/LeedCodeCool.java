package LeetCode;

import java.util.Arrays;

/**
 * project : Bootcamp1
 * package : LeetCode
 * author  : Allamuradov Tal'at
 * date    : 12.09.2022_13:28
 */
public class LeedCodeCool {
    public static void main(String[] args) {
        int[] arik = {3, 7};
        System.out.println(maxProduct(arik));
    }

    public static int maxProduct(int[] nums) {//{3,4,5,2}
        Arrays.sort(nums);
        return ((nums[nums.length - 1] - 1) * (nums[nums.length - 2] - 1));
    }
}

