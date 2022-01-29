package problem08;

import java.util.HashMap;
import java.util.Map;


/**
 * @author Samba Sallah
 * Running Time O(n)
 */
public class Solution {

    public int romanToInt(String s) {
        int sum = 0;
        Map<Character,Integer> romans = new HashMap<>();
        romans.put('I',1);
        romans.put('V',5);
        romans.put('X',10);
        romans.put('L',50);
        romans.put('C',100);
        romans.put('D',500);
        romans.put('M',1000);

        Map<String,Integer> exceptions = new HashMap<>();
        exceptions.put("IV",4);
        exceptions.put("IX",9);
        exceptions.put("XL",40);
        exceptions.put("XC",90);
        exceptions.put("CD",400);
        exceptions.put("CM",900);

        for(int i = 0; i < s.length(); i++) {
            if(i <= s.length()-2) {
                String b = s.charAt(i) + "" + s.charAt(i+1);
                if(exceptions.containsKey(b)) {
                    sum += exceptions.get(b);
                    i += 1;
                    continue;
                }
            }

            if(romans.containsKey(s.charAt(i))) {
                sum += romans.get(s.charAt(i));
            }
        }

        return sum;
    }
}
