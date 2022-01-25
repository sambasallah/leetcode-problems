package problem01;

public class Solution {

    public boolean validMountainArray(int[] arr) {

        if(arr.length < 3) return false;

        boolean flag = false;

        for(int i = 1; i < arr.length-1; i++) {
            if(arr[i-1] <= arr[i] && arr.length > 3) {
                flag = true;
                continue;
            } else if(arr[i-1] >= arr[i]) {
                flag = true;
                continue;
            } else {
                flag = false;
                break;
            }


        }

        return flag;

    }
}
