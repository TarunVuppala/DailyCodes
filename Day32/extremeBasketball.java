// https://www.codechef.com/START127D/problems/BBWIN
package Day32;
import java.util.*;

public class extremeBasketball {
public static void main (String[] args) throws java.lang.Exception
	{
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(a-b>=10){
                System.out.println("0");
                continue;
            }
            int c=(int)Math.ceil((double)(b+10-a)/3);
            System.out.println(c);
        }
        sc.close();
	}
}
