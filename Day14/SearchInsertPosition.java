import java.util.*;

public class SearchInsertPosition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        Solution sol=new Solution();
        int pos=sol.searchInsert(a,target);
        System.out.println(pos);
        sc.close();
    }
    
}
class Solution {
    public int searchInsert(int[] nums, int target) {
        int l=0,h=nums.length-1,mid=(l+h)/2;
        while(l<=h){
            if(target==nums[mid]){
                return mid;
            }
            else if(nums[mid]<target){
                l=mid+1;
            }
            else{
                h=mid-1;
            }
            mid=(l+h)/2;
        }
        return l;
    }
}