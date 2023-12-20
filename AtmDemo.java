import java.util.*;

class AtmDemo{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        float amt=sc.nextFloat();
        float bal=sc.nextFloat();
        
        if((amt+0.5f)<=bal && amt%5==0){
            bal-=amt+0.5f;
        }
        System.out.println(bal);
        sc.close();
    }
}

