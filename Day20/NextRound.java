package Day20;
import java.util.*;

public class NextRound {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int a[]=new int[n];
        int cnt=0;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(a[i]>=a[k-1]&&a[i]!=0){
                cnt++;
            }
            else{
                break;
            }
            
        }
        System.out.println(cnt);
        sc.close();
    }
}