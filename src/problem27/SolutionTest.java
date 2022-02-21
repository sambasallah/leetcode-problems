package problem27;

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
    void testStrStr() {
        String haystack = "hello";
        String needle = "ll";
        assertEquals(2, solution.strStr(haystack, needle));
    }

}