// https://leetcode.com/problems/length-of-last-word/description/
package Day36;
import java.util.*;

public class lengthOfLastWord {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(length(s));
        sc.close();
    }
    static int length(String s) {
        String w[]=s.trim().split(" ");
        if(w.length==0)
            return 0;
        
        return w[w.length -1].length();        
    }
}
