package LeetCode;

/**
 * project : Bootcamp1
 * package : LeetCode
 * author  : Allamuradov Tal'at
 * date    : 22.09.2022_11:12
 */
public class LeetCode1925CountSquareSumTriples {
    public static void main(String[] args) {
        int a=5;
        System.out.println(countTriples(a));
    }
    public static int countTriples(int n) {
        int c = 0;
        for (int i=1;i<=n-2;i++){
            for(int j=i+1;j<=n-1;j++){
                for(int k=j+1;k<=n;k++){
                    if(i*i+j*j==k*k)
                        c++;
                }
            }
        }
        return c*2;
    }
}
