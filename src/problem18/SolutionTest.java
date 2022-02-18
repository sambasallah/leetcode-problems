package problem18;

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
    void testLongestCommonPrefix() {
        String[] strs = {"flower","flow","flee"};
        assertEquals("fl",solution.longestCommonPrefix(strs));
    }

}