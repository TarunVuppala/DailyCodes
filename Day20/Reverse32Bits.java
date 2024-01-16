package Day20;
import java.util.*;

public class Reverse32Bits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long result = reverseBits(n);
        System.out.println(result);
        sc.close();
    }
    public static long reverseBits(long a) {
        long r=0;
        for(int i=0;i<32;i++){
            r=(r<<1)|(a&1);
            a>>=1;
        }
        return r;
	}
}