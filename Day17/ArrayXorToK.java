import java.util.*;
public class ArrayXorToK {
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
            int minOperations=minOperations(a,sc.nextInt());
            System.out.println(minOperations);
            sc.close();    
        }
    }
    public static int minOperations(int[] nums, int k) {
        int xor=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            xor^=nums[i];
        }
        int cnt=0;
        for(int i=0;i<32;i++){
            int bb=(xor>>i)&1;
            int bk=(k>>i)&1;
            if(bb!=bk){
                cnt++;
            }
        }
        return cnt;
    }
}
