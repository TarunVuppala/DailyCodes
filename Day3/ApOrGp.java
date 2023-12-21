import java.util.*;

public class ApOrGp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            if(a==0&&b==0&&c==0)
                break;
            if(a-b==b-c)
                System.out.println("AP "+(c+(b-a)));
            else if(b/a==c/b)
                System.out.println("GP "+(c*(b/a)));
        }
        sc.close();
    }
    
}