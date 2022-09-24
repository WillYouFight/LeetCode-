package LeetCode;

/**
 * project : Bootcamp1
 * package : LeetCode
 * author  : Allamuradov Tal'at
 * date    : 22.09.2022_11:33
 */
public class LeetCode1025DivisorGame {
    public static void main(String[] args) {
        int a=2;
        System.out.println(divisorGame(a));
        int b=6;
        System.out.println(divisorGame(b));
        int c=5;
        System.out.println(divisorGame(c));
        int f=4;
        System.out.println(divisorGame(f));
    }
    public static boolean divisorGame(int n) {
        return n%2==0;
    }
}
