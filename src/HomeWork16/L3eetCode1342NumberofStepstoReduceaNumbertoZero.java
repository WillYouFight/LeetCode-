package HomeWork16;

/**
 * project : Bootcamp1
 * package : HomeWork16
 * author  : Allamuradov Tal'at
 * date    : 20.09.2022_3:59
 */
public class L3eetCode1342NumberofStepstoReduceaNumbertoZero {
    public static void main(String[] args) {
        int a=14;
        System.out.println(numberOfSteps(a));
    }
    public static int numberOfSteps(int num) {
        int count=0;
        while(num!=0){
            if(num%2==0){
                num/=2;
                count++;
            }else{
                num--;
                count++;
            }
        }
        return count;
    }
}
