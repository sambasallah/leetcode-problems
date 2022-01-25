package problem01;

/**
 * @author Samba Sallah
 * Running Time O(n)
 */
public class Solution {

    public boolean validMountainArray(int[] arr) {
        // 0,2,3,4,5,2,1,0
        int peak = -1;
        int peakIndex = -1;
        boolean ascending  = false;
        for(int i = 1; i < arr.length; i++) {
            if(arr[i-1] < arr[i]) {
                ascending = true;
                continue;
            }

            if(!ascending) return false;

            if(arr[i-1] == arr[i]) return false;

            if(arr[i-1] > arr[i] & ascending) {
                peak = arr[i-1];
                peakIndex = i;
                break;
            }
        }



        for(int i = peakIndex + 1; i < arr.length; i++) {
            if(arr[i] < peak && arr[i-1] > arr[i]) continue;
            return false;
        }

        return true;
    }
}
