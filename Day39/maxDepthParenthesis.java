// https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/
package Day39;

public class maxDepthParenthesis {
    public static void main(String[] args) {
        String s = "(1+(2*3)+((8)/4))+1";
        System.out.println(maxDepth(s));
    }
    static int maxDepth(String s) {
        int len=s.length();
        int k=0,max=0;
        for(int i=0;i<len;i++){
            if(s.charAt(i)=='('){
                k++;
                max=Math.max(max,k);
            }
            else if(s.charAt(i)==')'){
                k--;
            }
        }
        return max;
    }    
}
