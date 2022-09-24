package LeetCode;

/**
 * project : Bootcamp1
 * package : LeetCode
 * author  : Allamuradov Tal'at
 * date    : 23.09.2022_9:53
 */
public class LeetCode1680ConcatenationofConsecutiveBinaryNumbers {
    public static void main(String[] args) {
        int n=1;
        System.out.println(concatenatedBinary(n));
        int a=3;
        System.out.println(concatenatedBinary(a));
        int b=12;
        System.out.println(concatenatedBinary(b));
    }
    final static int MODULO = 1000000007;
    public static int concatenatedBinary(int n) {
        long result = 0;
        int closestPower = 1;
        int leftShift = 0;
        for(int i=1;i<=n;i++){
            if(i%closestPower==0){
                leftShift++;
                closestPower *= 2;
            }
            result = result<<leftShift;
            result = result|i;
            result %= MODULO;
        }
        return (int)(result%MODULO);
    }
}
