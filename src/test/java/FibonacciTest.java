import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciTest {
    private Fibonacci fibonacci = new Fibonacci();

    @Test
    public void testFibonacci() {
        assertEquals(0, fibonacci.fib(0));
        assertEquals(1, fibonacci.fib(1));
    }
}
