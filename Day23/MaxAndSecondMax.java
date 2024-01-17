package Day23;
import java.util.*;

public class MaxAndSecondMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int max=Integer.MIN_VALUE;
            int sm=max;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                if(a[i]>max){
                    sm=max;
                    max=a[i];
                }
                else if(a[i]>sm &&a[i]!=max){
                    sm=a[i];
                }
            }
            System.out.println(max+sm);
        }
        sc.close();    
    }
}
