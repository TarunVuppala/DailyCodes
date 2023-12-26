package Day5;

import java.util.Scanner;

public class HollowRectangle {
    

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int w=sc.nextInt();
        int l=sc.nextInt();
        for(int i=0;i<l;i++){
            for(int j=0;j<w;j++){
                if(i==0||j==0||j==w-1||i==l-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
    
}
