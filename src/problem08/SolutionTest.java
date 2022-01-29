package problem08;

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
    void testRomanToInt() {
        String roman = "MCMXCIV";
        assertEquals(1994, solution.romanToInt(roman));
    }

}