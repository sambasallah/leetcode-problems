package problem21;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author Samba Sallah
 * Running Time O(n)
 * Faster than 99.39% of all submission 1ms
 */
public class Solution {

   public boolean isValid(String s) {
       Deque<Character> stack = new ArrayDeque<>();

       for(int i = 0; i < s.length(); i++) {
           char x = s.charAt(i);
           if(x == '(' || x == '{' || x == '[') {
               stack.push(x);
               continue;
           }


           if(x == ']' && stack.isEmpty() || x == '}' && stack.isEmpty()
           || x == ')' && stack.isEmpty()) return false;

           char check = stack.pop();

           switch (x) {
               case ')':
                   if(check == '{' || check == '[') return false;
                   break;
               case '}':
                   if(check == '(' || check == '[') return false;
                   break;
               case ']':
                   if(check == '(' || check == '{') return false;
                   break;
           }
       }

       return stack.isEmpty();
   }
}
