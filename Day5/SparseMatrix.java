package Day5;
import java.util.*;

public class SparseMatrix {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int e=n*m;
        int k=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int x=sc.nextInt();
                if(x==0){
                    k++;
                }
            }
        }
        if(k>e/2){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        sc.close();
    }
}