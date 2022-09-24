package HomeWork16;

/**
 * project : Bootcamp1
 * package : HomeWork16
 * author  : Allamuradov Tal'at
 * date    : 20.09.2022_11:58
 */
public class L10eedCode1863SumofAllSubsetXORTotals {
    public static void main(String[] args) {
        int []num = {1,3};
        System.out.println(subsetXORSum(num));
    }
    static int ans = 0;
    public static int subsetXORSum(int[] nums) {
        req(nums, 0, 0);
        return ans;
    }
    public static void req(int[] nums, int index, int n) {
        ans += n;
        for (int i = index; i < nums.length; i++) {
            req(nums, i + 1, n ^ nums[i]);
        }
    }
}
