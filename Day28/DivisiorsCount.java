package Day28;
import java.util.*;

public class DivisiorsCount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long n=sc.nextLong();
            int d=div(n);
            System.out.println(d);
        }
        sc.close();
    }
    static int div(long n){
        int div=0;
        for(long i=1;i<=(long)Math.sqrt(n);i++){
            if(n%i==0){
                if(n/i==i){
                    div+=1;
                }
                else{
                    div+=2;
                }
            }
        }
        return div;
    }
}