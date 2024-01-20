package Day29;
import java.util.*;

public class xAndySetBits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            t--;
            long x=sc.nextInt();
            long y=sc.nextInt();
            x=(pow2n(x));
            y=(pow2n(y));
            long m=1000000007;
            long set;
            if(x!=y){
                set=((x%m)+(y%m))%m;
            }
            else{
                set=x|y;
            }
            System.out.println(set);
        }
        sc.close();
    }
    static long pow2n(long n){
        if(n==0){
            return 1;
        }
        if(n==1){
            return 2;
        }
        long m=1000000007;
        long pow=pow2n(n/2)%m;
        if(n%2==0){
            return (pow%m*pow%m)%m;
        }
        else{
            return (2%m*pow%m*pow%m)%m;
        }
    }
}