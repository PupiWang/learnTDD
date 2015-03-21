import org.junit.Assert;
import org.junit.Test;

public class FibonacciTest {
    private Fibonacci fibonacci = new Fibonacci();
    @Test
    public void testFibonacci() {
        Assert.assertEquals(0, fibonacci.fib(0));
    }
}
