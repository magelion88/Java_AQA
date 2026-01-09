import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class ArithmeticTest {

    @Test
    public void testAddition() {
        int result = Arithmetic.calculate(10, 5, "+");
        assertEquals(result, 15);
    }

    @Test
    public void testAdditionWithNegative() {
        int result = Arithmetic.calculate(-5, 10, "+");
        assertEquals(result, 5);
    }


    @Test
    public void testSubtraction() {
        int result = Arithmetic.calculate(10, 5, "-");
        assertEquals(result, 5);
    }

    @Test
    public void testSubtractionNegativeResult() {
        int result = Arithmetic.calculate(5, 10, "-");
        assertEquals(result, -5);
    }

    @Test
    public void testMultiplication() {
        int result = Arithmetic.calculate(10, 5, "*");
        assertEquals(result, 50);
    }

    @Test
    public void testMultiplicationWithZero() {
        int result = Arithmetic.calculate(10, 0, "*");
        assertEquals(result, 0);
    }

    @Test
    public void testDivision() {
        int result = Arithmetic.calculate(10, 5, "/");
        assertEquals(result, 2);
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void testDivisionByZero() {
        Arithmetic.calculate(10, 0, "/");
    }

    @Test
    public void testDivisionNegative() {
        int result = Arithmetic.calculate(-10, 2, "/");
        assertEquals(result, -5);
    }

    // Тесты ошибок
    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testUnknownOperator() {
        Arithmetic.calculate(10, 5, "%");
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testEmptyOperator() {
        Arithmetic.calculate(10, 5, "");
    }

    @Test
    public void testMaxIntValues() {
        int result = Arithmetic.calculate(Integer.MAX_VALUE, 0, "+");
        assertEquals(result, Integer.MAX_VALUE);
    }

}