/*
 * Input
 * 5
 * 
 * Output
 * 1
 * 2 6
 * 3 7 10
 * 4 8 11 13
 * 5 9 12 14 15
 */
package Day5;

import java.util.*;

public class FloydTriangle {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.print(i+" ");
            int k=i;
            for(int j=1;j<i;j++){
                k+=(n-j);
                System.out.print(k+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}