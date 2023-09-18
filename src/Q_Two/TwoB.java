package Q_Two;

import java.util.*;

public class TwoB {
    private List<Integer> whitelistedPorts;

    public TwoB(int k, int[] blacklisted_ports) {
        whitelistedPorts = new ArrayList<>();

        // Generate the list of whitelisted ports
        for (int i = 0; i < k; i++) {
            whitelistedPorts.add(i);
        }
        for (int port : blacklisted_ports) {
            whitelistedPorts.remove(Integer.valueOf(port));
        }
    }

    public int get() {
        int randomIndex = (int) (Math.random() * whitelistedPorts.size());
        return whitelistedPorts.get(randomIndex);
    }

    public static void main(String[] args) {
        int k = 7;
        int[] blacklisted_ports = {2, 3, 5};
        TwoB randomPort = new TwoB(k, blacklisted_ports);

        System.out.println(randomPort.get()); // Output: Random whitelisted port between 0 and 6
        System.out.println(randomPort.get()); // Output: Random whitelisted port between 0 and 6
    }
}
