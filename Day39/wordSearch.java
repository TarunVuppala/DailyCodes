package Day39;

import java.util.*;

public class wordSearch {
    public static String LongestWord(String sen) {
        String w[] = sen.replaceAll("[^a-zA-Z\\s]", "").split(" ");
        int len = w.length;
        int maxI = 0, m = 0;
        for (int i = 0; i < len; i++) {
            if (w[i].length() > m) {
                maxI = i;
                m = w[i].length();
            }
        }
        return w[maxI];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(LongestWord(sc.nextLine()));
        sc.close();
    }

}