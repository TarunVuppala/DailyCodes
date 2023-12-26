package Day5;

import java.util.Scanner;

public class HalfDiamond {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k;
        for(int i=1;i<=2*n-1;i++){
            if(i<n){
                k=i;
            }
            else{
                k=2*n-i;
            }
            for(int j=1;j<=k;j++){
                System.out.print("*");
            }
            
            System.out.println();
        }
        sc.close();
    }
}
