package problem20;

public class Solution {

    public int myAtoi(String s) {
        if(s.length() == 0) return 0;
        if(s.isEmpty()) return 0;
        if(s.trim().length() == 0) return 0;
        int i = 0;
        boolean posFlag = false;
        boolean negFlag = false;

        while(s.charAt(i) == ' ' && i < s.length()) i++;


        if(s.charAt(i) == '+' && i < s.length()) {
            posFlag = true;
            i++;
            if(i > s.length()-1) return 0;
        }

        if(s.charAt(i) == '-' && i < s.length()) {
            negFlag = true;
            i++;
        }

        long ans = 0;


        while(i < s.length()) {
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                ans = ans * 10 + s.charAt(i) - '0';
            } else {
                break;
            }

            if(ans > Integer.MAX_VALUE-1) break;

            i++;
        }

        if(posFlag && negFlag) return 0;

        if(negFlag) {
            ans = -ans;
        }

        if(ans > Integer.MAX_VALUE) ans = Integer.MAX_VALUE;

        if(ans < Integer.MIN_VALUE) ans = Integer.MIN_VALUE;


        return (int) ans;

    }
}
