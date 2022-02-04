package problem10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        List<String> devices = new ArrayList<>();
        devices.add("TV");
        devices.add("Switch");
        devices.add("TV");
        devices.add("Switch");
        devices.add("TV");
        devices.add("Switch");

        System.out.println(solution.uniqueDeviceNames(devices));
    }

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
