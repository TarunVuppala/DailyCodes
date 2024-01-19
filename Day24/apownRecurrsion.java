package Day24;
import java.util.*;

public class apownRecurrsion {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            t--;
            int a=sc.nextInt();
            int n=sc.nextInt();
            long pow=apown(a,n);
            System.out.println(pow);
        }
        sc.close();
    }
    
    static long apown(int a,int n){
        if(n==1){
            return a;
        }
        long m=1000000007;
        long pow=apown(a,n/2)%m;
        if(n%2==0){
            return (pow%m*pow%m)%m;
        }
        else{
            return (a%m*pow%m*pow%m)%m;
        }
    }
}