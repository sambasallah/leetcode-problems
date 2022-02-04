package problem10;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void testUniqueDeviceNames() {
        List<String> devices = new ArrayList<>();
        devices.add("TV");
        devices.add("Switch");
        devices.add("TV");
        devices.add("Switch");
        devices.add("TV");
        devices.add("Switch");

        List<String> unique = solution.uniqueDeviceNames(devices);

        assertEquals("TV",unique.get(0));
        assertEquals("Switch", unique.get(1));
        assertEquals("TV1", unique.get(2));
        assertEquals("Switch1", unique.get(3));
        assertEquals("TV2", unique.get(4));
        assertEquals("Switch2", unique.get(5));
        assertEquals(6,unique.size());
    }

}