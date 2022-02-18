package problem19;

public class Solution {

    public int reverse(int x) {
        int reverse = 0;
        int digit = x;

        while(digit != 0) {
            int last = digit % 10;
            digit = digit / 10;
            reverse = reverse * 10 + last;
        }

        return reverse;

    }
}
