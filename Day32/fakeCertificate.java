// https://www.codechef.com/START125D/problems/FKMC
package Day32;
import java.util.*;

public class fakeCertificate {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t > 0) {
            int n = sc.nextInt();
            String st = sc.next();
            st = st.substring(0, n);

            int mi = 0, ma = 0, ones = 0;
            for (int i = 0; i < n; i++) {
                if (st.charAt(i) == '0') {
                    mi++;
                    if (mi > ma) {
                        ma = mi;
                    }
                } else {
                    mi = 0;
                    ones++;
                }
            }

            System.out.println(ma + ones);
            t--;
        }
        sc.close();
    }
}