package Q_Four;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class FourBTest {
    @Test
    public void testAreBrothersPositive() {
        FourB.TreeNode root = new FourB.TreeNode(1);
        root.left = new FourB.TreeNode(2);
        root.right = new FourB.TreeNode(3);
        root.left.left = new FourB.TreeNode(4);

        int x = 2;
        int y = 3;

        FourB solution = new FourB();
        boolean result = solution.areBrothers(root, x, y);
        assertTrue("Nodes " + x + " and " + y + " are expected to be brothers.", result);
    }

    @Test
    public void testAreBrothersNegative() {
        FourB.TreeNode root = new FourB.TreeNode(1);
        root.left = new FourB.TreeNode(2);
        root.right = new FourB.TreeNode(3);
        root.left.left = new FourB.TreeNode(4);

        int x = 2;
        int y = 4;

        FourB solution = new FourB();
        boolean result = solution.areBrothers(root, x, y);
        assertFalse("Nodes " + x + " and " + y + " are not expected to be brothers.", result);
    }
}
