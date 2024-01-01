package Day9;
import java.util.*;

public class MatrixRotation {
    
    public static String Beautiful(int[][] a) {
        for (int i = 0; i < 4; i++) {
            if (a[0][0] < a[0][1] && a[1][0] < a[1][1] && a[0][0] < a[1][0] && a[1][1] > a[0][1]) {
                return "YES";
            }
            int t = a[0][0];
            a[0][0] = a[1][0];
            a[1][0] = a[1][1];
            a[1][1] = a[0][1];
            a[0][1] = t;
        }
        return "NO";
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t = sc.nextInt();

        while(t>0) {
            int[][] a = new int[2][2];
            for(int i=0;i<2;i++){
                for(int j=0;j<2;j++){
                    a[i][j]=sc.nextInt();
                }
            }
            System.out.println(Beautiful(a));
            t--;
        }
        sc.close();
    }
}
