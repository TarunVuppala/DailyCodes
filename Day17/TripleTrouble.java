import java.util.*;
public class TripleTrouble {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            t--;
            int n=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            int res=result(a,n);
            System.out.println(res);
        }
        sc.close();
    }
    static int result(int a[],int n){
        int ans=0;
        for(int i=0;i<32;i++){
            int cnt=0;
            for(int j=0;j<n;j++){
                if(((a[j]>>i)&1)==1){
                    cnt++;
                }
            }
            if(cnt%3!=0){
                ans=ans+(1<<i);
            }
        }
        return ans;
    }
}