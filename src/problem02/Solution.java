package problem02;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Samba Sallah
 * Running Time O(n)
 */
public class Solution {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            map.put(nums[i],i);
        }

        for(int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if(map.containsKey(diff)) {
                return new int[]{i,map.get(diff)};
            }
        }

        return null;

    }
}
