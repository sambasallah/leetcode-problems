package problem23;

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
    void testRemoveDuplicats() {
        assertEquals(5,solution.removeDuplicates(new int[]{1,1,1,2,2,3}));
    }

}