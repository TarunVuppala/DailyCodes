package Day27;
import java.util.*;

public class SumAndXor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long n=sc.nextLong();
            long k=values(n);
            System.out.println(k);
        }
        sc.close();
    }
    static long values(long n){
        long cnt=1;
        int c=0;
        while(n>0){
            if((n&1)==0){
                c++;
            }
            n>>=1;
        }
        return (cnt<<c)-1;
    }
}