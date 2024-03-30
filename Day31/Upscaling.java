// https://codeforces.com/contest/1950/problem/B
import java.util.*;
 
public class Upscaling{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        String s="";
        while(t-->0){
            s="";
            int n=sc.nextInt();
            for(int i=0;i<2*n;i++){
                for(int j=0;j<2*n;j++){
                    if((i/2+j/2)%2==0){
                        s+= "#";
                    }
                    else{
                        s+= ".";
                    }
                }
                s+="\n";
            }
            System.out.print(s);
        }
        sc.close();
    }
}