package Day21;
import java.util.*;

public class Steps {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int steps=0,i=5;
        while(x>0){
            steps+=x/i;
            x=x%i;
            i--;
        }
        System.out.println(steps);
        sc.close();
    }
}