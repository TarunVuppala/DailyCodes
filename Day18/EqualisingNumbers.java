package Day18;
import java.util.*;

class EqualisingNumbers{
	public static void main (String[] args){
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
    		int a=sc.nextInt();
    		int b=sc.nextInt();
    		if((a-b)%2!=0){
    		    System.out.println("No");
    		}
    		else{
    		    System.out.println("Yes");
    		}
		}
        sc.close();
	}
}
