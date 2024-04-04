// https://www.codechef.com/problems/KITCHENTIME
package Day37;
import java.util.*;

public class kitchenTiming {
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int x=sc.nextInt();
		    int y=sc.nextInt();
		    System.out.println(y-x);
		}
        sc.close();
	}
}
