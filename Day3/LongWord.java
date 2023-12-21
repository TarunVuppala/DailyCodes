import java.util.*;

public class LongWord{
    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        while(n>0){
            String word=sc.next();
            int len=word.length();
            if(len>10){
                word=word.charAt(0)+Integer.toString(len-2)+word.charAt(len-1);
            }
            System.out.println(word);
            n--;
        }
        sc.close();
    }
}