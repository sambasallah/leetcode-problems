package problem15;

/**
 * @author Samba Sallah
 * Running Time O(n)
 */
public class Solution {


    public int totalWays(int score) {
       int[] arr = {2,3,6};
       int[] touchDownScores = {1,2};

       int count = 0;

       for(int i = 0; i < arr.length; i++) {
           for(int j=0; j < arr.length; j++) {
               if(j != i) {
                   // addition
                   if((arr[i] + arr[j]) == score) count++;
                   // multiplication
                   if((arr[i] * arr[j]) == score) count++;

               }
           }
       }

       for(int i = 0; i < touchDownScores.length; i++) {
           // addition
           if(touchDownScores[i] + 6 == score) count++;
           // multiplication
           if(touchDownScores[i] * 6 == score) count++;
       }

       return count;

    }
}
