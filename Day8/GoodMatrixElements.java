package Day8;
import java.util.*;

public class GoodMatrixElements {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[][]=new int[n][n];
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
                if(i==j || i+j==n-1 || i==n/2 || j==n/2){
                    sum+=a[i][j];
                }
            }
            
        }
        sc.close();
        System.out.println(sum);
    }
}