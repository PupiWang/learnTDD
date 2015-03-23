import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciTest {

    @Test
    public void testFibonacci() {
        int cases[][] = {{0, 0}, {1, 1}, {2, 1}, {3, 2}};
        for (int i = 0; i < cases.length; i++) {
            assertEquals(cases[i][1], Fibonacci.fib(cases[i][0]));
        }
    }

}
