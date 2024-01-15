package Day18;
import java.util.*;
//Take sorted Array
public class FirstAndLastPosElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        int res[]=new int[2];
        res=searchRange(a,target);
        System.out.println("First Position "+res[0]);
        System.out.println("Last Position "+res[1]);
        sc.close();
    }
    public static int[] searchRange(int[] nums, int target) {
        int res[]=new int[2];
        res[0]=res[1]=-1;
        int len=nums.length;
        if(len==0){
            res[0]=res[1]=-1;
            return res;
        }
        int l=0,h=len-1,m=(l+h)/2;
        while(l<=h){
            m=(l+h)/2;
            if(target==nums[m]){
                res[0]=res[1]=m;
                h=m-1;
            }
            else if(target>nums[m]){
                l=m+1;
            }
            else{
                h=m-1;
            }
        }
        l=0;h=len-1;m=(l+h)/2;
        while(l<=h){
            m=(l+h)/2;
            if(target==nums[m]){
                res[1]=m;
                l=m+1;
            }
            else if(target>nums[m]){
                l=m+1;
            }
            else{
                h=m-1;
            }
        }
        return res;

    }
}
