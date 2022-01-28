package problem05;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution;
    ListNode node;

    @BeforeEach
    void setUp() {
        node = new ListNode(1);
        solution = new Solution();
    }

    @Test
    void testPalindromeLinkedList() {
        node.next = new ListNode(2);
        node.next.next = new ListNode(1);
        assertTrue(solution.isPalindrome(node));
    }

}