package problem05;


/**
 * Definition for singly-linked list.
 */
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode cursor = head;
        StringBuilder sb = new StringBuilder();

        while(cursor != null) {
            sb.append(cursor.val);
            cursor = cursor.next;
        }

        StringBuilder copy = new StringBuilder(sb.toString());
        copy.reverse();

        if(copy.toString().equals(sb.toString())) return true;

        return false;

    }
}