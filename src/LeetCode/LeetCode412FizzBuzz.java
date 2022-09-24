package LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * project : Bootcamp1
 * package : LeetCode
 * author  : Allamuradov Tal'at
 * date    : 22.09.2022_11:00
 */
public class LeetCode412FizzBuzz {
    public static void main(String[] args) {
        int n=3;
        System.out.println(fizzBuzz(n));

    }
    public static List<String> fizzBuzz(int n) {
        ArrayList<String> val = new ArrayList<String>();
        for(int i=1; i<=n;i++){
            if(i%3==0 && i%5==0){
                val.add("FizzBuzz");
            }
            else{
                if(i%3==0){
                    val.add("Fizz");
                }
                else if(i%5==0){
                    val.add("Buzz");
                }
                else{
                    val.add(Integer.toString(i));
                }
            }

        }
        return val;
    }
}
