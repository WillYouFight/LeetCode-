package LeetCode;

/**
 * project : Bootcamp1
 * package : LeetCode
 * author  : Allamuradov Tal'at
 * date    : 12.09.2022_11:10
 */
public class LeedCode948BagOfTokens {
    public static void main(String[] args) {

    }
    public int bagOfTokensScore(int[] tokens, int power) {
        //Arrays.sort(tokens);
        int i=0,j=tokens.length-1,score=0;
        while(i<=j)
        {
            if(power>=tokens[i])
            {
                power-=tokens[i];
                ++score;
                ++i;
            }
            else
            {
                if(score>0&&i!=j)
                {
                    power+=tokens[j];
                    --score;
                }
                --j;

            }
        }
        return score>0?score:0;
    }
}
