// https://hive.smartinterviews.in/contests/si-ace-ic2/problems/finding-the-ceil-ic?page=0&pageSize=10
package Day41;
import java.util.*;

public class CeilInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        int nq=sc.nextInt();
        for(int i=0;i<nq;i++){
            int q=sc.nextInt();
            int l=0;
            int r=n-1;
            long res=Integer.MAX_VALUE;
            while(l<=r){
                int m=l+(r-l)/2;
                if(a[m]>=q){
                    res=a[m];
                    r=m-1;
                }
                else{
                    l=m+1;
                }
            }
            System.out.println(res);
        }
        sc.close();
    }
}