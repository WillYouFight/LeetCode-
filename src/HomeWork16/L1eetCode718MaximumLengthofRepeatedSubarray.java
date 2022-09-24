package HomeWork16;


/**
 * project : Bootcamp1
 * package : HomeWork16
 * author  : Allamuradov Tal'at
 * date    : 20.09.2022_2:50
 */
//Даны два целочисленных массива nums1 и nums2, вернуть
// максимальную длину подмассива, который появляется в обоих массивах.
public class L1eetCode718MaximumLengthofRepeatedSubarray {
    public static void main(String[] args) {
        int []numbers1={1,2,3,2,1};//length=5
        int []numbers2={3,2,1,4,7};//lrngth=5
        System.out.println(findLength(numbers1, numbers2));
        int []numbers3={0,0,0,0,0};
        int []numbers4={0,0,0,0,0};
        System.out.println(findLength(numbers3, numbers4));
    }
    public static int findLength(int[] a, int[] b) {
        int[][] deep = new int[a.length+1][b.length+1];
        int max = 0;
        for(int i = 0; i <= a.length; i++) {   //0//1//2//3
            for(int j= 0; j <= b.length; j++) {//0//1//2//3//4//5
                if(i == 0 || j == 0 || a[i-1] != b[j-1]) deep[i][j] = 0;
                else {
                    deep[i][j] = 1 + deep[i-1][j-1];
                    max = Math.max(max, deep[i][j]);//max=1//max=2
                }
            }
        }
        return max;
    }
}


