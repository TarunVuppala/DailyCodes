package Day23;
import java.util.*;

public class Values239 {
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t-->0){
	        int l=sc.nextInt();
	        int r=sc.nextInt();
	        int i=l;
	        int cnt=0;
	        while(i<=r){
	            if(i%10==2){
	                cnt++;
	                i++;
	            }
	            if(i%10==3 && i<=r){
	                cnt++;
	                i+=6;
	            }
	            if(i%10==9 && i<=r){
	                cnt++;
	                i+=3;
	                
	            }
	            else{
	                i++;
	            }
	        }
	        System.out.println(cnt);
	    }
        sc.close();
	}
}
