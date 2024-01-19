package Day25;
import java.util.*;
public class powerOf3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            System.out.println(isPowerOfThree(n));
        }
        sc.close();
    }
    public static boolean isPowerOfThree(int n) {
        if(n==1){
            return true;
        }
        if(n%3!=0||n<=0){
            return false;
        }
        return isPowerOfThree(n/3);
    }
    
}

