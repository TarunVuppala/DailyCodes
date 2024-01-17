package Day22;
import java.util.*;

public class LastDigit {
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int a=sc.nextInt();
			int b=sc.nextInt();
			if(a!=0){
				int p=apowb(a,b);
				System.out.println(p%10);
			}
			else{
				System.out.println(0);
				
			}
		}
        sc.close();
	}
	static int apowb(int a,int b){
		int ans=1,p=a,m=10;
		while(b>0){
			if((b&1)==1){
				ans=(ans * p)%m;
			}
			p=(p * p)%m;
			b>>=1;
		}
		return ans;
	}
}