package Day29;
import java.util.*;

public class MinimumCostArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int newArray=minimumCost(a);
        System.out.println(newArray);
        sc.close();
    }
    public static int minimumCost(int[] nums) {
        int subarray=nums[0];
        nums[0]=0;
        Arrays.sort(nums);
        subarray=subarray+nums[0]+nums[1]+nums[2];
        return subarray;
    }
}
