// https://hive.smartinterviews.in/contests/smart-interviews-primary/problems/sum-of-pairs
package Day34;
import java.util.*;

public class sumOfPairs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            long k=sc.nextLong();
            long a[]=new long[n];
            for(int i=0;i<n;i++)
                a[i]=sc.nextLong();
            String res=subsetSum(a,n,k)?"True":"False";
            System.out.println(res);
        }
        sc.close();
    }
    static boolean subsetSum(long a[],int n,long k){
        Arrays.sort(a);
        int p1=0,p2=n-1;
        while(p1<p2){
            long s=a[p1]+a[p2];
            if(s==k)
                return true;
            else if(s<k)
                p1++;
            else    
                p2--;
        }
        return false;
    }
}