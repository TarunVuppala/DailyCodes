// https://leetcode.com/problems/minimum-remove-to-make-valid-parentheses/?envType=daily-question&envId=2024-04-06
package Day41;

public class ValidParenthesisStr {
    public static void main(String[] args) {
        String s = "lee(t(c)o)de)";
        System.out.println(minRemoveToMakeValid(s));
    }

    static String minRemoveToMakeValid(String s) {
        int p = 0;
        String r = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                p++;
            } else if (s.charAt(i) == ')') {
                if (p == 0)
                    continue;
                p--;
            }
            r += ch;
        }
        String f = "";
        for (int i = r.length() - 1; i >= 0; i--) {
            if (p > 0 && r.charAt(i) == '(') {
                p--;
                continue;
            }
            f = r.charAt(i) + f;
        }
        return f;
    }

}
