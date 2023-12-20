import java.util.*;

public class TotalMovesForBishop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Solution bishop=new Solution();
        int a=sc.nextInt();
        int b=sc.nextInt();
        int totalMoves=bishop.solve(a,b);
        System.out.println(totalMoves);
        sc.close();
    }
}
class Solution {
    public int solve(int a, int b) {
        int topLeft=Math.min(a-1,b-1);
        int topRight=Math.min(8-a,b-1);
        int bottomLeft=Math.min(8-b,a-1);
        int bottomRight=Math.min(8-b,8-a);
        int totalMoves=topLeft+topRight+bottomLeft+bottomRight;
        return totalMoves;
    }
}
