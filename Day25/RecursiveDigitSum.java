//https://www.hackerrank.com/challenges/recursive-digit-sum/problem
package Day25;
import java.util.*;

public class RecursiveDigitSum{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        System.out.println(superDigit(s,n));
        sc.close();
    }
    public static int superDigit(String n, int k) {
            long s=0;
            
            for(int i=0;i<n.length();i++){
                s+=Character.getNumericValue(n.charAt(i));
            }
            if(k>1){
                
                s=s*k;
            }
            String y=Long.toString(s);
            if(y.length()==1){
                return (int) s;
            }
            else{
                return superDigit(y,0);
            }
    
        }
}