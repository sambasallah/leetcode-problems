package problem27;

public class Solution {

    public int strStr(String haystack, String needle) {
        if(haystack.length() == 0 && needle.length() == 0) return 0;

        if(needle.length() == 0) return 0;

        char firstChar = needle.charAt(0);

        if(needle.length() > haystack.length()) return -1;

        for(int i = 0; i< haystack.length(); i++) {
            if(haystack.charAt(i) == firstChar && i + needle.length() <= haystack.length()) {

                String sub = haystack.substring(i, i + needle.length());

                if(sub.equals(needle)) return i;
                else continue;
            }
        }

        return -1;
    }
}
