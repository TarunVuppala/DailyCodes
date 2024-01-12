import java.util.*;

public class RepeatedNumbers {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            t--;
            int n=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            repeatedNumbers(a,n);
        }
        sc.close();
    }
    static void repeatedNumbers(int a[],int n){
        int ans=0;
        for(int i=0;i<n;i++){
            ans^=a[i];
        }
        for(int i=1;i<=n-2;i++){
            ans^=i;
        }
        int bit=findSetBit(ans);
        int x=0,y=0;
        for(int i=0;i<n;i++){
            if(checkBit(a[i],bit)){
                x^=a[i];
            }
            else{
                y^=a[i];
            }
        }
        for(int i=1;i<=n-2;i++){
            if(checkBit(i,bit)){
                x^=i;
            }
            else{
                y^=i;
            }
        }
        if(x > y)
        System.out.println(y+" "+x);
        else
        System.out.println(x+" "+y);
    }
    static int findSetBit(int n){
        int i=0;
        while(n>0){
            if((n&1)==1){
                return i;
            }
            i++;
            n>>=1;
        }
        return i;
    }
    static boolean checkBit(int n,int i){
        return (((n>>i)&1)==1);
    }
}