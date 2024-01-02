package Day10;
import java.util.*;

public class MaxAltitude {
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int maxAltitude=a[0],x=a[0];
        for(int i=1;i<n;i++){
            x+=a[i];
            if(x>maxAltitude){
                maxAltitude=x;
            }
        }
        System.out.println(maxAltitude);
        sc.close();
    }
}