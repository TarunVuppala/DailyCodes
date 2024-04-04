// https://www.codechef.com/START128D/problems/MOOCHEF
package Day38;
import java.util.*;

public class MoodyChef {
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int l = sc.nextInt();
            int r = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = sc.nextInt();
            moodCalc(a,n,l,r);
        }
        sc.close();
    }
    static void moodCalc(int a[], int n, int l, int r) {
        int max = 0, min = 0, h = 0;
        for (int i = 0; i < n; i++)
        {
            if (a[i] >= l && a[i] <= r)
                h++;
            else
                h--;

            if (h > max)
                max = h;
            if (h < min)
                min = h;
        }
        System.out.println(max + " " + min);

    }
}