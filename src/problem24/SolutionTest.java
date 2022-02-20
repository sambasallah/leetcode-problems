package problem24;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void testFirstPalindrome() {
        assertEquals("aba",solution.firstPalindrome(new String[]{"baba","ddvc","aba"}));
    }

}