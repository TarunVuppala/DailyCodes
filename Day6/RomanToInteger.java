package Day6;

import java.util.*;

class Solution {
    public int romanToInt(String s) {
        int len = s.length();
        int result = 0;

        for (int i = 0; i < len; i++) {
            char ch = s.charAt(i);
            int chValue = RomanValue(ch);

            if (i < len - 1) {
                char nextCh = s.charAt(i + 1);
                int nextChValue = RomanValue(nextCh);

                if (chValue < nextChValue) {
                    result -= chValue;
                } else {
                    result += chValue;
                }
            } else {
                result += chValue;
            }
        }

        return result;
    }

    static int RomanValue(char ch) {
        switch (ch) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
}

public class RomanToInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int result = new Solution().romanToInt(s);
        System.out.println(result);
        sc.close();
    }
}