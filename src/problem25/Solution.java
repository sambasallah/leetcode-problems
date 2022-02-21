package problem25;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        System.out.println(new Solution().removeElement(new int[]{3,2,2,3},3));
    }

    public int removeElement(int[] nums, int val) {
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != val) {
                list.add(nums[i]);
            }
        }

        for(int i = 0; i < nums.length; i++) {
            nums[i] = '_';
        }

        for(int i = 0; i < list.size(); i++) {
            nums[i] = list.get(i);
        }

        for(int i = list.size(); i < nums.length; i++) {
            nums[i] = '_';
        }

        return list.size();
    }
}
