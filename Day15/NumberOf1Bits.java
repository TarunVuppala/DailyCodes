package Day15;
import java.util.*;

public class NumberOf1Bits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long x=sc.nextLong();
        Solution s=new Solution();
        int n=s.numSetBits(x);
        System.out.println(n);
        sc.close();
    }
}
class Solution {
	public int numSetBits(long a) {
		int c=0;
		int i=1;
		while(a>0){
			if((a&1)==1){
				c++;
			}
			a=a>>i;
			
		}
		return c;
	}
}
