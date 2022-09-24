package HomeWork16;

/**
 * project : Bootcamp1
 * package : HomeWork16
 * author  : Allamuradov Tal'at
 * date    : 20.09.2022_5:51
 */
//Вам дано натуральное число, состоящее только из цифр 6 и 9.
//Верните максимальное число, которое можно получить, изменив не более одной цифры (6 становится 9, а 9 становится 6).
public class L6eedCode1323Maximum69Number {
    public static void main(String[] args) {
        int a=9669;
        System.out.println(maximum69Number(a));
        int b=9996;
        System.out.println(maximum69Number(b));
    }
    public static int maximum69Number (int num) {
        int current=0;
        int remain=0;
        int i=1000;
        int n=num;
        while(i>0)
        {
            current=num/i;
            num=num%i;
            if(current==6)
            {
                remain=i;
                break;
            }
            i=i/10;
        }
        n+= remain*3;
        return n;
    }
}
