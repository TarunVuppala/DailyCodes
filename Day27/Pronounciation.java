package Day27;

import java.util.*;

public class Pronounciation {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next().toLowerCase();
        int c=0,f=1;

        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch!='a'&&ch!='e'&&ch!='i'&&ch!='o'&&ch!='u'){
                c++;
            }
            else{
                c=0;
            }
            if(c>=4){
                System.out.println("NO");
                f=0;
                break;
            }
        }
        if(f==1){
            System.out.println("YES");
        }
        sc.close();
    }
}