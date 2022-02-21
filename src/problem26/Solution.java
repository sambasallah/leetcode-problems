package problem26;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {


    public void moveZeroes(int[] nums) {
        if(nums.length == 1) System.out.println(Arrays.toString(nums));
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) list.add(nums[i]);
        }

        Arrays.fill(nums,0);

        for(int i = 0; i < list.size(); i++) {
            nums[i] = list.get(i);
        }

        System.out.println(Arrays.toString(nums));

    }
}
