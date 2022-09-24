package LeetCode;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * project : Bootcamp1
 * package : LeetCode
 * author  : Allamuradov Tal'at
 * date    : 11.09.2022_14:32
 */
public class LeetCode1383MaximumPerformanceOfaTeam {
    public static void main(String[] args) {
//        int n=6;
//        int k=2;
//        int []efficiency={2,10,3,1,5,8};
//        int []speed={5,4,3,9,7,2};
//        int[][] players = new int[n][2];
//        for (int i=0; i<n; i++) {
//            players[i][0] = efficiency[i];//00=
//            players[i][1] = speed[i];//
//        }
//        System.out.println(Arrays.deepToString(players));
//          Arrays.sort(players, (p1, p2) -> (p2[0] - p1[0]));
//        System.out.println(Arrays.deepToString(players));

    }
    public int maxPerformance(int n, int[] speed, int[] efficiency, int k){
            int[][] players = new int[n][2];
            for (int i=0; i<n; i++) {
                players[i][0] = efficiency[i];
                players[i][1] = speed[i];
            }
            Arrays.sort(players, (p1, p2) -> (p2[0] - p1[0]));
            PriorityQueue<Integer> speedQueue = new PriorityQueue<>(k);
    long teamPerformance = 0, teamSpeed = 0;

        for (int i=0; i<n; i++) {
        if (speedQueue.size() >= k) {
            teamSpeed -= speedQueue.remove();
        }
        speedQueue.add(players[i][1]);
        teamSpeed += players[i][1];

        teamPerformance = Math.max(teamPerformance, teamSpeed * players[i][0]);
    }
        return (int) (teamPerformance % 1000000007);
    }
}
