package problem13;

/**
 * @author Samba Sallah
 * Running Time O(n)
 */
public class Solution {

    public String mirrorEnds(String str) {
        int startPointer = 0;
        int endPointer = str.length()-1;
        String mirror = "";

        while(startPointer < str.length()) {
            if(str.charAt(startPointer) == str.charAt(endPointer)) {
                mirror += str.charAt(startPointer);
                startPointer++;
                endPointer--;
                continue;
            } else {
                break;
            }
        }

        return mirror;
    }
}
