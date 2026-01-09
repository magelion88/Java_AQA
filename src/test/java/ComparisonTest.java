import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class ComparisonTest {

    @Test
    public void testGreater() {
        assertEquals(Comparison.compare(10, 5), "10 больше 5");
    }

    @Test
    public void testLess() {
        assertEquals(Comparison.compare(5, 10), "5 меньше 10");
    }

    @Test
    public void testEqual() {
        assertEquals(Comparison.compare(5, 5), "Числа равны");
    }
}