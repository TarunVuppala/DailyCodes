// https://www.codechef.com/START126D/problems/DICEGAME3
package Day32;
import java.util.*;

public class diceGame {
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int score;
            score=(n/2)+6*(n/2)*2;
            score=(n%2==0)?score:score+6;
            System.out.println(score);
        }
        sc.close();
	}
}
