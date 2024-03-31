
// https://www.codechef.com/problems/AND?tab=statement
package Day35;
import java.util.*;

public class pairwiseAndSum {
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long a[]=new long[n];
		long res=0;
		for(int i=0;i<n;i++){
		    a[i]=sc.nextLong();
		}
		for(int i=0;i<n;i++){
		    for(int j=i+1;j<n;j++){
		        res+=a[i]&a[j];
		    }
		}
		System.out.println(res);
        sc.close();
	}
}
