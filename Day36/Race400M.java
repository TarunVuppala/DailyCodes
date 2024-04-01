// https://www.codechef.com/practice/course/sorting/SORTING/problems/RACE400M?tab=statement
package Day36;
import java.util.*;

public class Race400M{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            // your code goes here
            if(x<y && x<z)
                System.out.println("ALICE");
            else if(y<z)
                System.out.println("BOB");
            else
                System.out.println("CHARLIE");
        }
        sc.close();
    }
}