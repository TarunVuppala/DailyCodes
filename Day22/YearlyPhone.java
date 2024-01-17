package Day22;
import java.util.*;

class Codechef
{
	public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=n%10;
        n/=10;
        int o=n%10;
        System.out.println("K"+o+t);
        sc.close();
	}
}
