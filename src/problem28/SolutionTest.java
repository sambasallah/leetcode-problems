package problem28;

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
    void testSearchInsert() {
        assertEquals(1,solution.searchInsert(new int[]{1,3,5,6},2));
    }

}