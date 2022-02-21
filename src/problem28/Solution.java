package problem28;

/**
 * @author Samba Sallah
 * Running Time O(log n)
 * Faster than 100% of all submission - 0ms
 */
public class Solution {

    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        int middle = 0;

        while(start <= end) {
            middle =  (start + end)/ 2;
            if(nums[middle] < target) {
                start = middle + 1;
            } else if(nums[middle] > target) {
                end = middle -1;
            } else {
                return middle;
            }
        }

        if(nums[middle] > target) {
            return middle;
        } else {
            return middle + 1;
        }
    }
}
