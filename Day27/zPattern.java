package Day27;
import java.util.*;

public class zPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++){
            int n=sc.nextInt();
            System.out.println("Case #"+i+":");
            printZ(n);
        }
        sc.close();
    }
    static void printZ(int n){
        int k=n-1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0||i==n-1||j==k){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
            k--;
        }
    }
}