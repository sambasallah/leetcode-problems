package problem16;

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
    void testLengthOfLongestSubstring() {
        String str = "abcdabcdef";
        assertEquals(6,solution.lengthOfLongestSubstring(str));
    }

}