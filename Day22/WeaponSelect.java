package Day22;
import java.util.*;

public class WeaponSelect {
	public static void main (String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
            double h = sc.nextInt();
            double x = sc.nextInt();
            double y1 = sc.nextInt();
            double y2 = sc.nextInt();
            int k = sc.nextInt();

            int hx = (int) Math.ceil(h / x);
            int hy = (int) Math.ceil(h / y1);
            if(k<hy){
                hy=k;
                h-=(y1*k);
                hy+=(int) Math.ceil(h / y2);
            }

            System.out.println(Math.min(hx, hy));
		}
        sc.close();
	}
}
