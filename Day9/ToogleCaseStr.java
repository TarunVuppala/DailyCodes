package Day9;
import java.util.*;

public class ToogleCaseStr {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int len=s.length();
        String ts="";
        for(int i=0;i<len;i++){
            char ch=s.charAt(i);
            if(ch>=65&&ch<=90){
                ts+=(char)(ch+32);
            }
            else{
                ts+=(char)(ch-32);
            }
        }
        System.out.println(ts);
        sc.close();
    }
}