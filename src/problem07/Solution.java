package problem07;

/**
 * @author Samba Sallah
 * Running Time O(n)
 */
public class Solution {

    public boolean validPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++) {
            String newStr = s.substring(0,i) + s.substring(i+1);
            if(newStr.equals(sb.append(newStr).reverse().toString())) return true;
            else {
                sb.setLength(0);
            }
        }

        return false;

    }
}
