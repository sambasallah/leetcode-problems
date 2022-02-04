package problem10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author  Samba Sallah
 * Running Time O(n)
 */
public class Solution {

    public List<String> uniqueDeviceNames(List<String> deviceNames) {
        List<String> unique = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();

        for(String str: deviceNames) {
            if(map.containsKey(str)) {
                String uniqueStr = str + "" + (map.get(str) + 1);
                unique.add(uniqueStr);
                map.put(str,map.get(str) + 1);
            } else {
                map.put(str, 0);
                unique.add(str);
            }
        }

        return  unique;
    }
}
