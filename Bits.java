import java.util.*;

public class Bits{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=0;
        while(n>0){
            String bit=sc.next();
            if(bit.contains("++")){
                x++;
            }
            else{
                x--;
            }
            n--;
        }
        System.out.println(x);
        sc.close();
    }
}