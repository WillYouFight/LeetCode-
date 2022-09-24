package LeetCode;

import java.util.Scanner;

/**
 * project : Bootcamp1
 * package : LeetCode
 * author  : Allamuradov Tal'at
 * date    : 06.09.2022_12:53
 */
public class LeetCode1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Sondi kirting: ");
        int n=scanner.nextInt();
        int a=0;
        int b=1;
        int d=0;
        while (n>0){
            a+=n%10;
            b*=n%10;
            n=n/10;
        }
        d=b-a;
        System.out.println(d);
    }
}
