import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class TriangleAreaTest {

    @Test
    public void testAreaWithPositiveNumbers() {
        double result = TriangleArea.calculateArea(10, 5);
        assertEquals(result, 25.0);  // 0.5 * 10 * 5 = 25
    }

    @Test
    public void testAreaWithBaseOne() {
        double result = TriangleArea.calculateArea(1, 10);
        assertEquals(result, 5.0);  // 0.5 * 1 * 10 = 5
    }

    @Test
    public void testAreaWithHeightOne() {
        double result = TriangleArea.calculateArea(10, 1);
        assertEquals(result, 5.0);  // 0.5 * 10 * 1 = 5
    }

    @Test
    public void testAreaLargeNumbers() {
        double result = TriangleArea.calculateArea(100, 50);
        assertEquals(result, 2500.0);  // 0.5 * 100 * 50 = 2500
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testAreaWithZeroBase() {
        TriangleArea.calculateArea(0, 10);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testAreaWithZeroHeight() {
        TriangleArea.calculateArea(10, 0);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testAreaWithNegativeBase() {
        TriangleArea.calculateArea(-5, 10);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testAreaWithNegativeHeight() {
        TriangleArea.calculateArea(10, -5);
    }

    @Test
    public void testAreaPrecision() {
        double result = TriangleArea.calculateArea(3, 7);
        assertEquals(result, 10.5);
    }

    @Test
    public void testMultipleCases() {
        assertEquals(TriangleArea.calculateArea(2, 2), 2.0);
        assertEquals(TriangleArea.calculateArea(4, 6), 12.0);
        assertEquals(TriangleArea.calculateArea(8, 3), 12.0);
    }
}