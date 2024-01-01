package Day9;
import java.util.*;

public class IntegerToRoman {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(intToRoman(n));
        sc.close();

    }
    static String intToRoman(int num) {
        int nums[]={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String val[]={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        String res="";
        int i=0;
        
        while(num>0){
            while(num>=nums[i]){
                res+=val[i];
                num-=nums[i];
            }
            i++;
        }
        return res;
    }
    
}
