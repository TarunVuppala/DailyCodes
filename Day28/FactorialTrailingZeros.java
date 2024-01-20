package Day28;
import java.util.*;

public class FactorialTrailingZeros {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            System.out.println(trailingZeroes(n));
        }
        sc.close();
    }
    public static int trailingZeroes(int n) {
        int cnt=0;
        for(int i=5;n/i>=1;i*=5){
            cnt+=n/i;
        }
        return cnt;
    }
}
