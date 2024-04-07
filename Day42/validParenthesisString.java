// https://leetcode.com/problems/valid-parenthesis-string/
package Day42;

import java.util.*;

class validParenthesisString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(new validParenthesisString().checkValidString(s));
        sc.close();
    }

    public boolean checkValidString(String s) {
        int p1 = 0;
        int p2 = 0;
        for (int i = 0; i < s.length(); i++) {
            p1 += s.charAt(i) == '(' ? 1 : -1;
            p2 += s.charAt(i) == ')' ? -1 : 1;

            if (p2 < 0)
                break;

            p1 = p1 < 0 ? 0 : p1;
        }
        return p1 == 0;
    }
}