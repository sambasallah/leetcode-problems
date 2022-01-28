package problem06;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution;

    @BeforeEach
    void Setup() {
        solution = new Solution();
    }

    @Test
    void testIsPalindrome() {
        String palindrome = "A man, a plan, a canal: Panama";
        assertTrue(solution.isPalindrome(palindrome));
    }

}