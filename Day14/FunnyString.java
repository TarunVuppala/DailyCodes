import java.util.*;

public class FunnyString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q=sc.nextInt();
        while(q>0){
        q--;
        String s=sc.next();
        String res=funnyString(s);
        System.out.println(res);
        }
        sc.close();
    }
    public static String funnyString(String s) {
        int len=s.length();
        for(int i=0,j=len-1;i<len-1&&j>0;i++,j--){
            char fi=s.charAt(i);
            char ni=s.charAt(i+1);
            char fj=s.charAt(j);
            char nj=s.charAt(j-1);
            if(Math.abs(fi-ni)!=Math.abs(fj-nj)){
                return "Not Funny";
            }
        }
        return "Funny";

    }
}
