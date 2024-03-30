// https://leetcode.com/problems/first-bad-version/
package Day34;

class VersionControl {
    boolean isBadVersion(int version) {
        return true; //dummy
    }
}


public class findingFirstBadVersion {

    public static void main(String[] args) {
        Solution obj = new Solution();
        System.out.println(obj.firstBadVersion(5));
    }
    
}
class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int l=1;
        int h=n;
        int ans=0;
        while(l<=h){
            int m=l+(h-l)/2;
            boolean bad=isBadVersion(m);
            if(bad){
                ans=m;
                h=m-1;
            }
            else if(!bad)
                l=m+1;
            else
                h=h-1;
        }
        return ans;
    }

    
}