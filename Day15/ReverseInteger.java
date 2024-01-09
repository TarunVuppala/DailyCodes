package Day15;

import java.util.*;

public class ReverseInteger{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        Solution s=new Solution();
        int r=s.reverse(x);
        System.out.println(r);
        sc.close();
    }
    
}

class Solution {
    public int reverse(int x) {
        if(x<=Integer.MIN_VALUE){
            return 0;
        }
        long rs=0;
        int s=x<0?-1:1;
        x=Math.abs(x);
        while(x>0){
            rs=(rs*10)+x%10;
            x/=10;
        }
        if(rs > Integer.MAX_VALUE || rs<Integer.MIN_VALUE){
            return 0;
        }
        int r=(int)rs;
        return s*r;
    }
}