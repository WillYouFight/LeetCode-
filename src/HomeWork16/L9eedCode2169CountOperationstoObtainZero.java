package HomeWork16;

/**
 * project : Bootcamp1
 * package : HomeWork16
 * author  : Allamuradov Tal'at
 * date    : 20.09.2022_8:01
 */
    //Вам даны два целых неотрицательных числа num1 и num2.
    //В одной операции, если num1 >= num2, вы должны вычесть num2 из num1, иначе вычесть num1 из num2.
    //Например, если num1 = 5 и num2 = 4, вычтите num2 из num1,
    // получив таким образом num1 = 1 и num2 = 4. Однако, если num1 = 4 и num2 = 5, после одной операции num1 = 4 и num2 = 1.
public class L9eedCode2169CountOperationstoObtainZero {
    public static void main(String[] args) {
        int a=2;
        int b=3;
        System.out.println(countOperations(a, b));
        int c=10;
        int d=10;
        System.out.println(countOperations(c, d));
    }
    public static int countOperations(int num1, int num2) {
        int count = 0;

        while (num1 != 0 && num2 != 0) {
            if (num1 >= num2) num1 -= num2;
            else num2 -= num1;
            count++;
        }
        return count;
    }
}
