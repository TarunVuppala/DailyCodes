package Day5;

import java.util.*;

public class MatrixTranspose {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        long a[][]=new long[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                a[i][j]=sc.nextLong();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(a[j][i]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}