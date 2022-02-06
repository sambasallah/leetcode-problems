package problem14;

/**
 * @author Samba Sallah
 * Running Time O(n)
 */
public class Solution {

    public int divide(int dividend, int divisor) {
        int count = 0;

        while(dividend > 0 && dividend >= divisor) {
            dividend -= divisor;
            count++;
        }

        return count;
    }
}
