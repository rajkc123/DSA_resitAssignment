package Q_Two;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TwoBTest {
    @Test
    public void testRandomWhitelistedPort() {
        int k = 7;
        int[] blacklisted_ports = {2, 3, 5};
        TwoB randomPort = new TwoB(k, blacklisted_ports);

        // Ensure that the generated random ports are within the whitelisted range
        for (int i = 0; i < 10; i++) { // Test multiple times
            int port = randomPort.get();
            assertTrue(port >= 0 && port < k);
        }
    }
}
