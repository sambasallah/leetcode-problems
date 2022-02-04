package problem09;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Samba Sallah
 * Running Time O(n)
 */
public class Solution {

    public Character maximumOccurringCharacter(String str) {
        Map<Character,Integer> map = new HashMap<>();
        Integer max = 0;
        Character character = ' ';
        for(int i = 0; i < str.length(); i++) {
            if(map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
            } else {
                map.put(str.charAt(i),1);
            }
        }

        for(Map.Entry<Character,Integer> mapElement : map.entrySet()) {
                if(mapElement.getValue() > max) {
                    max = mapElement.getValue();
                    character = mapElement.getKey();
                }
        }

        return character;
    }
}
