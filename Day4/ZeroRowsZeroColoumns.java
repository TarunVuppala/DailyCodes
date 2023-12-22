package Day4;

/* https://hive.smartinterviews.in/contests/smart-interviews-basic/problems/zero-row-and-zero-column?page=0&pageSize=100*/
import java.util.*;

public class ZeroRowsZeroColoumns {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int a[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(a[i][j]==0){
                    for(int k=0;k<n;k++){
                        if(a[i][k]!=0){
                            a[i][k]=-1;
                        }
                    }
                    for(int k=0;k<m;k++){
                        if(a[k][j]!=0){
                            a[k][j]=-1;
                        }
                    }
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(a[i][j]==-1){
                    a[i][j]=0;
                }
                System.out.print(a[i][j]+" ");

            }
            System.out.println();
        }
        sc.close();
    }
}