package Day24;
import java.util.*;

public class TowerOfHanoi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            System.out.println((1<<n)-1);
            toh(n,'A','B','C');
        }
        sc.close();
    }
    static void toh(int n,char src,char temp,char des){
        if(n==0){
            return;
        }
        toh(n-1,src,des,temp);
        System.out.println("Move "+n+" from "+ src+" to "+des);
        toh(n-1,temp,src,des);
    }
}