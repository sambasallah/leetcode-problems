package problem19;

public class Solution {

    public int reverse(int x) {
        int reverse = 0;
        int digit = x;

        while(digit != 0) {
            int last = digit % 10;
            digit = digit / 10;
            reverse = reverse * 10 + last;

            if(reverse > Integer.MAX_VALUE) return 0;

            if(reverse < Integer.MIN_VALUE) return 0;
        }

        return reverse;

    }
}
