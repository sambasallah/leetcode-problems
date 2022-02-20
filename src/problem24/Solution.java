package problem24;

public class Solution {

    public String firstPalindrome(String[] words) {
        for(int i = 0; i < words.length; i++) {
            if(isPalindrome((words[i]))) return words[i];
            else continue;
        }
        return "";
    }

    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length()-1;

        if(s.length() == 1) return true;

        while(s.charAt(start) == s.charAt(end) && start < end) {
            start++;
            end--;
        }

        if(start > end) return true;

        if(start == end) return true;

        return false;


    }
}
