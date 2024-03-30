import java.util.*;

public class PrintValidParan {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++){
            int n=sc.nextInt();
            System.out.println("Test Case #"+i+":");
            paran("",n,0,0);
        }
        sc.close();
    }

    static void paran(String s,int n ,int oc,int cc){
        if(s.length()==n*2){
            System.out.println(s);
            return;
        }

        if(oc<n){
            paran(s+'{',n,oc+1,cc);
        }
        if(cc<oc){
            paran(s+'}',n,oc,cc+1);
        }
    }
}