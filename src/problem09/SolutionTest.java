package problem09;

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
    void testMaximumOccuringCharacter() {
        String str = "abbcbbccc";
        assertEquals('b',solution.maximumOccuringCharacter(str));
    }

}