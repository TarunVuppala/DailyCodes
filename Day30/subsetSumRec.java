import java.util.*;

public class subsetSumRec {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            boolean res=subsetSum(a,n,k,0,0);
            String s=(res==true)?"YES":"NO";
            System.out.println(s);
        }
        sc.close();
    }
    static boolean subsetSum(int a[],int n,int k,int s,int idx){
        if(n==idx){
            return s==k;
        }
        if(s==k){
            return true;
        }

        return subsetSum(a,n,k,s+a[idx],idx+1) || subsetSum(a,n,k,s,idx+1);
    }
}