package Day12;
import java.util.*;

public class CaesarsCipher {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int k=s.length();
        System.out.println(caesarCipher(s,k));
        sc.close();
    }
    public static String caesarCipher(String s, int k) {
        String ns="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if (Character.isLetter(ch)){
                char base=(Character.isUpperCase(ch))?'A':'a';
                char ec=(char)((ch-base+k+26)%26+base); 
                ns+=ec;
            }
            else{
            ns+=ch;
            }
        }
        return ns;
    }
    
}
