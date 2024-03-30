// https://hive.smartinterviews.in/contests/smart-interviews-primary/problems/finding-the-floor
package Day34;
import java.util.*;

public class findingTheFloor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int nq=sc.nextInt();
        for(int i=0;i<nq;i++){
            int q=sc.nextInt();
            int res=floor(a,n,q);
            System.out.println(res);
        }
        sc.close();
    }
    static int floor(int a[],int n,int k){
        Arrays.sort(a);
        int l=0;
        int h=n-1;
        int m=(l+h)/2;
        int res=Integer.MIN_VALUE;
        while(l<=h){
            m=(l+h)/2;
            if(a[m]<=k){
                res=a[m];
                l=m+1;
            }
            else{
                h=m-1;
            }
        }
        return res;
    }
}