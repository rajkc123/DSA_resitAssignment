package Q_Five;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FiveATest {
    @Test
    public void evaluateWithMatchingSolution() {
        char[] solution = "Hello, World!".toCharArray();
        int result = FiveA.evaluate(solution);
        assertEquals(0, result);
    }
    @Test
    public void evaluateWithDifferentSolution() {
        char[] solution = "Hdllo, Wwrld!".toCharArray();
        int result = FiveA.evaluate(solution);
        assertEquals(10, result);
    }

    @Test
    public void evaluateWithEmptySolution() {
        char[] solution = new char[0];
        int result = FiveA.evaluate(solution);
        assertEquals(0, result);
    }
}
