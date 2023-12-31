package Day8;
import java.util.*;

public class ReverseArray {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n/2;i++){
            int t=a[i];
            a[i]=a[n-i-1];
            a[n-i-1]=t;
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        sc.close();
    }
}