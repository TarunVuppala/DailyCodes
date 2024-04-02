// https://leetcode.com/problems/isomorphic-strings/
package Day37;

public class isomorphicStrings {
    public static void main(String[] args) {
        String s="egg";
        String t="add";
        System.out.println(isIsomorphic(s,t));
    }

    static boolean isIsomorphic(String s, String t) {
        int len=s.length();
        if(len!=t.length()) return false;

        int si[]=new int[200];
        int ti[]=new int[200];

        for(int i=0;i<len;i++){
            if(si[s.charAt(i)]!=ti[t.charAt(i)]) return false;

            si[s.charAt(i)]=i+1;
            ti[t.charAt(i)]=i+1;
        }
        return true;
        
    }
    
}
