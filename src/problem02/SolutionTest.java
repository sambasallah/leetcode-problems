package problem02;

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
    void testTwoSum() {
        assertArrayEquals(new int[]{0,1}, solution.twoSum(new int[]{3,3,4}, 6));
    }

}