package Day12;
import java.util.*;
public class CheckBits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=sc.nextInt();
        n>>=i;
        if((n&1)==1){
            System.out.println("true");
        }
        else{
            System.out.println("false");

        }
        sc.close();
    }
}
