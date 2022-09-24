package HomeWork16;

/**
 * project : Bootcamp1
 * package : HomeWork16.L4eedCode1486.L4eetCode1486
 * author  : Allamuradov Tal'at
 * date    : 20.09.2022_4:05
 */
public class L4eetCode1486XOROperationinanArray {
    public static void main(String[] args) {
        int a=5;
        int start=0;
        System.out.println(xorOperation(a, start));
    }
    public static int xorOperation(int n, int start) {
        int c=0;
        for(int i=0;i<n;i++)c=c^(start+2*i);
        return c;
    }
}
