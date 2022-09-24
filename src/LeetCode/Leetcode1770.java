package LeetCode;

/**
 * project : Bootcamp1
 * package : LeetCode
 * author  : Allamuradov Tal'at
 * date    : 16.09.2022_16:01
 */
public class Leetcode1770 {
    public static void main(String[] args) {

    }
}
class SolutionLeetCode1770 {
    int N, M;
    public int maximumScore(int[] nums, int[] multipliers) {
        N = nums.length;
        M = multipliers.length;
        return helper(nums, multipliers, 0, 0, new Integer[M][M]);
    }

    private int helper(int[] nums, int[] multipliers, int left, int index, Integer[][] dp) {
        int right = N - 1 - (index - left);
        if (index == M) return 0;

        if (dp[left][index] != null) return dp[left][index];

        int res = Math.max(
                nums[left] * multipliers[index] + helper(nums, multipliers, left+1, index+1, dp),
                nums[right] * multipliers[index] + helper(nums, multipliers, left, index+1, dp));

        dp[left][index] = res;
        return res;
    }
}
