package HomeWork16;

/**
 * project : Bootcamp1
 * package : HomeWork16
 * author  : Allamuradov Tal'at
 * date    : 20.09.2022_6:34
 */
    //Имея целое число n (в системе счисления 10) и базу k, верните сумму цифр n после преобразования n из базы 10 в базу k.
    //После преобразования каждая цифра должна интерпретироваться как число с основанием 10,
    // а сумма должна быть возвращена в виде числа с основанием 10.
public class L7eedCode1837SumofDigitsinBaseK {
    public static void main(String[] args) {
        L7eedCode1837SumofDigitsinBaseK leedCode7= new L7eedCode1837SumofDigitsinBaseK();
        int a=34;
        int b=6;
        System.out.println(leedCode7.sumBase(a, b));
        int d=10;
        int c=10;
        System.out.println(leedCode7.sumBase(d, c));

    }
    public  int sumBase(int n, int k) {//n=34//k=6;
        int res=0;
        while(n>0){//1step=34//2step=5//3step=FALSE
            res+=(n%k);//res=4//res=9
            n=n/k;//=5//=0
        }
        return res;
    }
}
