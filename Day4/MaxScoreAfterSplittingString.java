package Day4;
import java.util.*;

public class MaxScoreAfterSplittingString {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s=sc.next();
        Solution obj=new Solution();
        System.out.println(obj.maxScore(s));
        sc.close();
    }
    
}
class Solution {
    public int maxScore(String s) {
        int len=s.length();
        int temp=-1;
        for(int i=0;i<len-1;i++){
            String ls=s.substring(0,i+1);
            String rs=s.substring(i+1);
            int lc=0,rc=0,ts=0;
            for(int l=0;l<ls.length();l++){
                if(ls.charAt(l)=='0'){
                    lc++;
                }
            }
            for(int r=0;r<rs.length();r++){
                if(rs.charAt(r)=='1'){
                    rc++;
                }
            }
            ts=rc+lc;
            if(ts>temp){
                temp=ts;
            }
        }
        return temp;
    }
}