// https://hive.smartinterviews.in/contests/si-ace-ic2/problems/check-palindrome-ic?page=0&pageSize=10
package Day40;
import java.util.*;

public class strPalindromeTwoP {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            boolean res=checkPalindrome(s,n);
            System.out.println(res?"Yes":"No");
        }
        sc.close();
    }
    static boolean checkPalindrome(String s,int n){
        int l=0;
        int r=n-1;
        while(l<r){
            if(s.charAt(l)!=s.charAt(r))
                return false;
            l++;
            r--;
        }
        return true;
    }
}