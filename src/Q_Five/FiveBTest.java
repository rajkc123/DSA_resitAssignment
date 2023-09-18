package Q_Five;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FiveBTest {
    @Test
    public void testMinReorder() {
        int n = 6;
        int[][] connections = {{0, 1}, {1, 3}, {2, 3}, {4, 0}, {4, 5}};
        int expectedMinReversals = 3; // The minimum number of reversals required.

        int result = FiveB.minReorder(n, connections);
        assertEquals(expectedMinReversals, result);
    }
}
