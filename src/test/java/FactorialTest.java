import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class FactorialTest {

    @Test
    public void testFactorialOfZero() {
        long result = factorial.calculateFactorial(0);
        assertEquals(result, 1L);
    }

    @Test
    public void testFactorialOfOne() {
        long result = factorial.calculateFactorial(1);
        assertEquals(result, 1L);
    }

    @Test
    public void testFactorialOfFive() {
        long result = factorial.calculateFactorial(5);
        assertEquals(result, 120L);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testFactorialOfNegative() {
        factorial.calculateFactorial(-1);
    }
}