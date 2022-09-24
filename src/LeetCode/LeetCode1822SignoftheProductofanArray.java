package LeetCode;

/**
 * project : Bootcamp1
 * package : LeetCode
 * author  : Allamuradov Tal'at
 * date    : 22.09.2022_11:44
 */
public class LeetCode1822SignoftheProductofanArray {
    public static void main(String[] args) {
        int []a={-1,-2,-3,-4,-3,-2};
        System.out.println(arraySign(a));
        int []b={5};
        System.out.println(arraySign(b));
        int []c={5,3,4-1,-3,0};
        System.out.println(arraySign(c));
        int []d={5,3,4,-3,5,7};
        System.out.println(arraySign(d));



    }
    public static int arraySign(int[] nums) {
        int sign = 1;
        for(int i = 0 ; i < nums.length;i++)
        {
            if(nums[i] == 0)
                return 0;
            if(nums[i] < 0)
                sign *= -1;
        }
        return sign;
    }
}
