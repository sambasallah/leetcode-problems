package problem11;

import java.util.List;

/**
 * @author Samba Sallah
 * Running Time O(n^2)
 */
public class Solution {

    public int maxDifference(List<Integer> px) {
        int pointer = 0;
        int max = -1;
        for(int i = 0; i < px.size(); i++) {

            while(pointer < i) {

                if(px.get(i) > px.get(pointer)) {
                    int diff = px.get(i) - px.get(pointer);

                    if(diff > max) max = diff;
                }

                pointer++;

            }

            pointer = 0;
        }

        return max;


    }
}
