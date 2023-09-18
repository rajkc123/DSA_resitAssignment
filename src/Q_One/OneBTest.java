package Q_One;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OneBTest {
    @Test
    public void testMinimumCoins() {
        int[] ratings = {1, 0, 2};
        int expectedMinimumCoins = 5; // The minimum number of coins required based on the given ratings.

        int result = OneB.minimumCoins(ratings);
        assertEquals(expectedMinimumCoins, result);
    }
}
