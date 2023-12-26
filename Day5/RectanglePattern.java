package Day5;

import java.util.Scanner;

public class RectanglePattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=n;j>0;j--){
                if(i==j){
                    System.out.print("*");
                    continue;
                }
                System.out.print(j);
            }
            System.out.println();
        }
        sc.close();
    }
}
