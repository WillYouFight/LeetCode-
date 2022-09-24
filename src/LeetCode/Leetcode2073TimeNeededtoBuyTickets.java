package LeetCode;

/**
 * project : Bootcamp1
 * package : LeetCode
 * author  : Allamuradov Tal'at
 * date    : 17.09.2022_23:30
 */
public class Leetcode2073TimeNeededtoBuyTickets {
    public static void main(String[] args) {

    }
    public int timeRequiredToBuy(int[] tickets, int k) {
        int count=0;
        while(tickets[k]>0){
            for(int i=0;i<tickets.length;i++){
                if(tickets[i]>0){
                    tickets[i]-=1;
                    count++;
                }
                if(tickets[k]==0)break;
            }
        }
        return count;
    }
}


