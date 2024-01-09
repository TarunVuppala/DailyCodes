package Day15;
import java.util.*;

public class TrailingZeros {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int n=solve(x);
        System.out.println(n);
        sc.close();
    }
    public static int solve(int n) {
        int c=0;
        while(n>0){
            if((n&1)!=1){
                c++;
            }
            else{
                break;
            }
            n>>=1;
        }
        return c;
    }
}