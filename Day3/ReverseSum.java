import java.util.*;

public class ReverseSum{
	static int reverse(int n){
		int rev=0;
		while(n>0){
			rev=rev*10+ n%10;
			n/=10;
		}
		return rev;
	}
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0){
			int a=sc.nextInt();
			int b=sc.nextInt();
			int reverseSum=reverse(reverse(a)+reverse(b));
			System.out.println(reverseSum);
			t--;
		}
        sc.close();
	}
}