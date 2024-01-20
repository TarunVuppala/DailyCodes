package Day28;

import java.util.*;

public class ConsecutiveSetBits {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long n=sc.nextLong();            
            int k=bits(n);
            System.out.println(k);
        }
        sc.close();
    }
    static int bits(long n){
        int c=0,max=-1;
        while(n>0){
            if((n&1)==1){
                c++;
            }
            else{
                if(c>max){
                    max=c;
                }
                c=0;
            }
            n>>=1;
        }
        return Math.max(max,c);
    }
}