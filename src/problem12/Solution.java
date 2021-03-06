package problem12;

/**
 * @author Samba Sallah
 * Running Time O(n)
 */
public class Solution {

    public boolean isPalindrome(String str) {
        int endPointer = str.length()-1;
        int startPointer = 0;

        while(startPointer < str.length()) {
            if(str.charAt(startPointer) == str.charAt(endPointer)) {
                startPointer++;
                endPointer--;
                continue;
            }
            else return false;
        }

        return true;
    }
}
