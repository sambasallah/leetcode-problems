package problem22;

import java.util.ArrayList;
import java.util.List;

public class Solution {

   public int removeDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        if(nums.length == 1) return 1;
        int pointer = 0;

        for(int i = 1; i < nums.length; i++) {
             if(nums[pointer] == nums[i]) {
                 nums[i] = '_';
                 continue;
             }
             if(nums[pointer] != nums[i]) {
                 list.add(nums[pointer]);
                 pointer = i;
             }
        }

        list.add(nums[pointer]);

        for(int i = 0; i < nums.length; i++) {
            nums[i] = 0;
        }

        for(int i = 0; i < list.size(); i++) {
            nums[i] = list.get(i);
        }


        for(int i = list.size(); i < nums.length;i++) {
            nums[i] = '_';
        }

        return list.size();
   }
}
