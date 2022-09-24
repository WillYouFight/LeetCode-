package HomeWork16;

/**
 * project : Bootcamp1
 * package : HomeWork16
 * author  : Allamuradov Tal'at
 * date    : 20.09.2022_5:10
 */
public class L5eedCode1688CountofMatchesinTournament {
    public static void main(String[] args) {
        int n=7;
        System.out.println(numberOfMatches(n));
    }
    public static int numberOfMatches(int n) {
        int count=0;
        while(n!=1){
            count+=(n/2);
            n= (n%2!=0) ? ((n-1)/2)+1 : n/2;
        }
        return count;
    }
}
