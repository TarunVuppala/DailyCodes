package Day10;
import java.util.*;

public class SqrtNOFunctions {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Solution obj=new Solution();
        System.out.println(obj.mySqrt(n));
        sc.close();
    }
}

class Solution {
    public int mySqrt(int x) {
        long l=1,h=x/2;
        if(x<2){
            return x;
        }
        while(l<=h){
            long mid=(l+h)/2;
            long ms=mid*mid;
            if(ms==x){
                return (int) mid;
            }
            else if(ms<x){
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        return (int) h;
    }
}