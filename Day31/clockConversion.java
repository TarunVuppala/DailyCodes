// https://codeforces.com/contest/1950/problem/C
import java.util.*;

public class clockConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < t; i++) {
            String time = sc.nextLine();
            String[] parts = time.split(":");
            int hrs = Integer.parseInt(parts[0]);
            int minu = Integer.parseInt(parts[1]);
            String p = (hrs < 12) ? "AM" : "PM";
            if (hrs == 0) {
                hrs = 12;
            } else if (hrs > 12) {
                hrs -= 12;
            }
            System.out.printf("%02d:%02d %s%n", hrs, minu, p);
        }
        sc.close();
    }
}