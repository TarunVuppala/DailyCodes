package Day8;
import java.util.*;

public class LongestPrefixSuffix {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int n=s.length(),l=0,i=1;
        int lps[]=new int[n];
        lps[0]=0;
        while(i<n){
            if(s.charAt(i)==s.charAt(l)){
                l++;
                lps[i]=l;
                i++;
            }
            else {
                if(l!=0){
                    l=lps[l-1];
                }
                else{
                    lps[i]=0;
                    i++;
                }
            }
        }
        System.out.println(lps[n-1]);
        sc.close();
    }
}