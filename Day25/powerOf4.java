package Day25;
import java.util.*;
public class powerOf4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            System.out.println(isPowerOfFour(n));
        }
        sc.close();
    }
    public static boolean isPowerOfFour(int n) {
        if(n==1){
            return true;
        }
        if(n%4!=0||n<=0){
            return false;
        }
        return isPowerOfFour(n/4);
    }
/*    public static boolean isPowerOfFour(int n) {
        for(int i=0;i<=n;i+=2){
             if((1<<i)==n){
               return true;
             }
             else if((1<<i)>n){
               return true;
             }
        }
        return false;
    }
 */
}
