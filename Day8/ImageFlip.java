package Day8;
import java.util.*;

public class ImageFlip {    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a[][]=new int[n][m];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=sc.nextInt();
            }
        }
        
        //Horizontal Flip
        for(int i=0;i<n;i++){
            for(int j=0;j<m/2;j++){
                int t=a[i][j];
                a[i][j]=a[i][m-j-1];
                a[i][m-j-1]=t;
            }
        }

        //Invert Image
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=1-a[i][j];
            }
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}