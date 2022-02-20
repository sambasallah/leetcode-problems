package problem22;

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
    void testRemoveDuplicates() {
        int[] arr = {1,1,2,2,2,3,3,3,4,4,4};
        assertEquals(4, solution.removeDuplicates(arr));
    }

}