package HomeWork16;

/**
 * project : Bootcamp1
 * package : HomeWork16
 * author  : Allamuradov Tal'at
 * date    : 20.09.2022_7:25
 */
    //Например, изменение местами 2021 дает 1202. Изменение местами 12300 дает 321, поскольку ведущие нули не сохраняются.
    //Если задано целое число, переверните число, чтобы получить перевернутое
    // 1,затем переверните перевернутое1, чтобы получить перевернутое2.
    //  Возвращает true,если reversed2 равно num. В противном случае вернуть ложь.
public class L8eedCode2119ANumberAfteraDoubleReversal {
    public static void main(String[] args) {
        int a= 526;
        System.out.println(isSameAfterReversals(a));
    }
    public static boolean isSameAfterReversals(int num) {
        if( num == 0 ){
            return true;
        }
        if(num % 10 == 0) {
            return false;
        }
        return true;
    }
}
