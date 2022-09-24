package HomeWork16;

/**
 * project : Bootcamp1
 * package : HomeWork16
 * author  : Allamuradov Tal'at
 * date    : 20.09.2022_3:45
 */
public class L2eetCode2413SmallestEvenMultiple {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(smallestEvenMultiple(a));
        int b = 6;
        System.out.println(smallestEvenMultiple(b));
    }

    public static int smallestEvenMultiple(int n) {
        if (n % 2 == 0) return n;
        return n * 2;
    }
}
