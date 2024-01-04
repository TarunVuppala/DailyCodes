package Day11;
import java.util.*;

public class CompressString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int len=s.length();
        String ns="";
        for(int i=0;i<len;i++){
            char ch=s.charAt(i);
            int c=1;
            while(i+1<len && s.charAt(i+1)==ch){
                c++;
                i++;
            }
            ns+=ch+Integer.toString(c);
        }
        System.out.println(ns);
        sc.close();
    }
}