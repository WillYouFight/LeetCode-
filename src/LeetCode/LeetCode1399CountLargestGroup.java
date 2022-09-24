package LeetCode;

/**
 * project : Bootcamp1
 * package : LeetCode
 * author  : Allamuradov Tal'at
 * date    : 22.09.2022_11:39
 */
public class LeetCode1399CountLargestGroup {
    public static void main(String[] args) {
        int n=13;
        System.out.println(countLargestGroup(n));
        int b=2;
        System.out.println(countLargestGroup(b));
    }
    public static int countLargestGroup(int n) {
        int largest = 0;
        int[] map = new int[37];
        int sumOfDigit = 0;
        for(int i =1; i <=n;i++){
            if(i % 10 == 0) {
                sumOfDigit = getSumOfDigits(i);
            } else {
                sumOfDigit++;
            }
            int val = ++map[sumOfDigit];
            largest = Math.max(val, largest);
        }
        return countLargestGroup(largest, map);
    }
    private static int getSumOfDigits(int num) {
        int sum = 0;
        while(num >0) {
            sum += num%10;
            num /=10;
        }
        return sum;
    }
    private static int countLargestGroup(int largest, int[] arr) {
        int count =0;
        for(int val:arr) {
            if(val == largest) count++;
        }
        return count;
    }
}
