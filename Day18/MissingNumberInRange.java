package Day18;
import java.util.*;
public class MissingNumberInRange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int missingNumber=missingNumber(a);
        System.out.println(missingNumber);
        sc.close();
    }
    public static int missingNumber(int[] nums) {
        int len=nums.length;
        int xor=0;
        for(int i=0;i<len;i++){
            xor^=nums[i];
        }
        for(int i=1;i<=len;i++){
            xor^=i;
        }
        return xor;
    }
}
