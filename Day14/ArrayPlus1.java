import java.util.*;

public class ArrayPlus1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int nPlusOne[]=plusOne(a);
        for(int i=0;i<n+1;i++){
            System.out.print(nPlusOne[i]);
        }
        sc.close();
    }
    public static int[] plusOne(int[] digits) {
        
       
        for(int i = digits.length-1; i >= 0; i--){
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        digits = new int[digits.length + 1];
        digits[0] = 1;


        return digits;
    }



}