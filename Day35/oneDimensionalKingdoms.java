// https://www.codechef.com/problems/ONEKING?tab=statement
package Day35;
import java.util.*;

public class oneDimensionalKingdoms {
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int a[][]=new int[n][2];
            for(int i=0;i<n;i++){
                a[i][0]=sc.nextInt();
                a[i][1]=sc.nextInt();
            }
            Arrays.sort(a,Comparator.comparingInt(arr->arr[0]));
            int c=1;
            int k=a[0][1];
            for(int i=1;i<n;i++){
                if(a[i][0]>k){
                    c++;
                    k=a[i][1];
                }
                else{
                    k=Math.min(k,a[i][1]);
                }
            }
            System.out.println(c);
        }
        sc.close();
	}
}