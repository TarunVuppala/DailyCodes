import java.util.*;

public class WrongSubtraction{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        
        for(int i=1;i<=b;i++){
            if(a%10==0){
                a/=10;
            }
            else{
                a-=1;
            }
        }
        System.out.println(a);
        sc.close();
    }
}