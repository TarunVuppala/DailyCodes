package Day9;
import java.util.*;
public class DivisionWithoutOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dividend = sc.nextInt();
        int divisor = sc.nextInt();
        Solution obj = new Solution();
        System.out.println(obj.divide(dividend, divisor));
        sc.close();
    }
}

class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend==0){
            return 0;
        }
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        int sign = (dividend < 0) ^ (divisor < 0) ? -1 : 1;
        int quotient = 0;

        long ldividend = Math.abs((long) dividend);
        long ldivisor = Math.abs((long) divisor);

        while (ldividend >= ldivisor) {
            long tempDivisor = ldivisor, multiple = 1;
            while (ldividend >= tempDivisor) {
                ldividend -= tempDivisor;
                quotient += multiple;
                tempDivisor <<= 1;
                multiple <<= 1;
            }
        }

        return sign * quotient;
    }
}