package LeetCode;

/**
 * project : Bootcamp1
 * package : LeetCode
 * author  : Allamuradov Tal'at
 * date    : 22.09.2022_11:27
 */
public class LeetCode762NumberofSetBitsinBinaryRepresentation {
    public static void main(String[] args) {
        int left=6;
        int right=10;
        System.out.println(countPrimeSetBits(left, right));

    }
    public static int countPrimeSetBits(int L, int R) {
        int counter=0;

        if(R <= 15){
            return R - L;
        }
        int n = 0;
        int count=0;
        for(int i=L;i<=R;i++){
            n=i;
            count=0;
            while(n!=0){
                n = n&(n-1);
                count++;
            }
            if(isPrime(count)){
                counter++;
            }
        }
        return counter;
    }
    public static boolean isPrime(int num){
        if(num==1)return false;
        if(num == 2 || num == 3)return true;
        if(num % 2 == 0 || num % 3 == 0)return false;
        for(int i=5;i*i<=num;i=i+6)
            if(num % i == 0 || num % (i+2) == 0)
                return false;
        return true;
    }
}
