package Day24;
import java.util.*;

class ifPowOf2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            boolean res=isPowerOfTwo(n);
            System.out.println(res);
        }
        sc.close();
    }
    public static boolean isPowerOfTwo(int n) {
        if(n<=0)
            return false;
        return (n&(n-1))==0;
    }
}