package problem23;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public int removeDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        if(nums.length == 1) return 1;
        int pointer = 0;
        int counter = 0;

        for(int i = 1; i < nums.length; i++) {
            if(nums[pointer] == nums[i]) {
                if(counter == 0) {
                    list.add(nums[pointer]);
                    list.add(nums[i]);
                }
                if(counter > 0) {
                    nums[i] = '_';
                }
                counter++;
                continue;
            }
            if(nums[pointer] != nums[i]) {
                if(nums[pointer] != nums[i] && !list.contains(nums[pointer])) list.add(nums[pointer]);
                pointer = i;
                counter = 0;
            }

        }

        if(!list.contains(nums[pointer])) list.add(nums[pointer]);


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
