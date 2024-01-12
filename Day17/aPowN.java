import java.util.*;

public class aPowN {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            t--;
            int a=sc.nextInt();
            int n=sc.nextInt();
            int pow=apown(a,n);
            System.out.println(pow);
        }
        sc.close();
    }
    static int apown(int a, int n){
        long p=1,x=a,m=1000000007;
        while(n>0){
            if((n&1)==1){
                p=(p%m*x%m)%m;
            }
            x=(x%m*x%m)%m;
            n>>=1;
        }
        return (int)p%1000000007;
    }
}