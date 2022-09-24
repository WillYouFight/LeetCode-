package LeetCode;

import java.util.Arrays;

/**
 * project : Bootcamp1
 * package : LeetCode
 * author  : Allamuradov Tal'at
 * date    : 15.09.2022_11:21
 */
public class LeetCode2007FindOriginalArrayFromDoubledArray {
    public static void main(String[] args) {
        int []a={1,3,4,2,6,8};
        int []b={6,3,0,1};
        int []c={1};
//        Solution1770 solution=new Solution1770();
//        System.out.println(Arrays.toString(solution.findOriginalArray(a)));
//        System.out.println(Arrays.toString(solution.findOriginalArray(b)));
//        System.out.println(Arrays.toString(solution.findOriginalArray(c)));
    }
}
class Solution{
    int[] res;
    int index=0;
    public int[] findOriginalArray(int[] changed) {
        if(changed.length%2==1) return new int[0];
        res = new int[changed.length/2];
        int max = 0;
        for(int num: changed) max = Math.max(max, num);
        int[] nums = new int[max+1];
        for(int num: changed) nums[num]++;

        if(nums[0]%2==1) return new int[0];
        fill(0, nums[0]/2);

        for(int i=1; i<=max/2; i++){
            if(nums[2*i] < nums[i]) return new int[0];
            nums[2*i] -= nums[i];
            fill(i, nums[i]);
        }
        return index != res.length ? new int[0] : res;
    }
    private void fill(int num, int count){
        while(count-->0)
            res[index++] = num;
    }
}

