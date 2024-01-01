package Day9;
import java.util.*;

public class LeftAndRightSum {
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            sum+=a[i];
        }
        int leftSum=0,rightSum=sum;
        int b[]=new int[n];
        for(int i=0;i<n;i++){
            rightSum-=a[i];
            b[i]=Math.abs(leftSum-rightSum);
            leftSum+=a[i];
        }
        for(int i=0;i<n;i++){
            System.out.print(b[i]+" ");
        }
        sc.close();
    }
}