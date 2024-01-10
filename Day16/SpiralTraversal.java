package Day16;
import java.util.*;

public class SpiralTraversal {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int m[][]=new int[n][n];
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    m[i][j]=sc.nextInt();
                }
            }
            spiral(m,n);
            System.out.println();

        }
        sc.close();
    }
    static void spiral(int m[][],int n){
        int t=0,b=n-1,l=0,r=n-1;
        while(t<=b&&l<=r){
            for(int i=l;i<=r;i++){
                System.out.print(m[t][i]+" ");
            }
            t++;
            for(int i=t;i<=b;i++){
                System.out.print(m[i][r]+" ");
            }
            r--;
            if(t<=b){
                for(int i=r;i>=l;i--){
                    System.out.print(m[b][i]+" ");
                }
                b--;
            }
            if(l<=r){
                for(int i=b;i>=t;i--){
                    System.out.print(m[i][l]+" ");
                }
                l++;
            }
        }
    }
}