package Day16;
import java.util.*;

public class Hatrikk {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        char over[]=new char[6];
        int t=sc.nextInt();

        int c=0;
        while(t>0){
            t--;
            for(int i=0;i<6;i++){
                over[i]=sc.next().charAt(0);
            }
            c=0;
            for(int i=1;i<5;i++){
                if(over[i-1]=='W' && over[i] == 'W' && over[i+1]=='W'){
                    c=1;
                    System.out.println("YES");
                    break;
                }
            }
            if(c==0){
                System.out.println("NO");
            }
        }
        sc.close();
    }
}