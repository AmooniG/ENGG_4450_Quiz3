import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MultiplicationTest {

    @Test
    void testMultiply() {
        assertEquals(0, Multiplication.multiply(0, 10));  // Expected: 0, Error: Returns 1
        assertEquals(20, Multiplication.multiply(4, 5));  // Expected: 20
        assertEquals(-20, Multiplication.multiply(-4, 5)); // Expected: -20
    }

    @Test
    void testMultiplyUsingLoop() {
        assertEquals(0, Multiplication.multiplyUsingLoop(0, 10));  // Expected: 0
        assertEquals(20, Multiplication.multiplyUsingLoop(4, 5));  // Expected: 20
        assertEquals(-20, Multiplication.multiplyUsingLoop(4, -5)); // Expected: -20
    }

    @Test
    void testMultiplyUsingShift() {
        assertEquals(20, Multiplication.multiplyUsingShift(4, 5));  // Expected: 20
        assertEquals(-20, Multiplication.multiplyUsingShift(4, -5)); // Expected: -20, Error: Incorrect sign logic
    }
}
