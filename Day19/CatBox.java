package Day19;
import java.util.*;

public class CatBox {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String i=sc.next();
            String tar=sc.next();
            int r=operations(n,i,tar);
            System.out.println(r);
        }
        sc.close();
    }
    static int operations(int n,String in, String t){
        int op=0,i1=0,t1=0;
        for(int i=0;i<n;i++){
            if(in.charAt(i)=='1'){
                i1++;
            }
            if(t.charAt(i)=='1'){
                t1++;
            }
        }
        for(int i=0;i<n;i++){
            if(in.charAt(i)!=t.charAt(i)){
                op++;
            }
        }
        int k=0;
        if(op>0){
            if((i1-t1)>0){
                k=i1-t1;
            }
            else if(i1!=0){
                t1=t1-i1;
                k=i1-t1;
            }
        }
        return op-k;
    }
}