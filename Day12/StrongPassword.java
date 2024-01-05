package Day12;
import java.util.*;

public class StrongPassword {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String p=sc.next();
        int n=p.length();
        int minNo=minimumNumber(n, p);
        System.out.println(minNo);
        sc.close();

    }
    public static int minimumNumber(int n, String password) {
            int len=0;
            if(n<6){
                len=6-n;
            }
            String nu = "0123456789";
            String lc = "abcdefghijklmnopqrstuvwxyz";
            String uc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            String sc = "!@#$%^&*()-+";
            int nm=1,l=1,u=1,s=1;
            for(int i=0;i<n;i++){
                String ch=Character.toString(password.charAt(i));
                if(nu.contains(ch)){
                    nm=0;
                }
                else if(lc.contains(ch)){
                    l=0;
                }
                else if(uc.contains(ch)){
                    u=0;
                }
                else if(sc.contains(ch)){
                    s=0;
                }
                else if(n<6){
                    l=n-6;
                }
            }
            return Math.max(nm+u+l+s,len);
        }
}
