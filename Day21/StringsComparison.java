package Day21;
import java.util.*;

public class StringsComparison {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s1=sc.next().toLowerCase();
        String s2=sc.next().toLowerCase();
        if(s1.equals(s2)){
            System.out.println("0");
        }
        else if(s1.compareTo(s2)<0){
            System.out.println("-1");
        }
        else if(s1.compareTo(s2)>0){
            System.out.println("1");
        }
        sc.close();
    }
}