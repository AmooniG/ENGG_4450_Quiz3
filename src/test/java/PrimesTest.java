import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PrimesTest {

    @Test
    void testIsPrime() {
        assertFalse(Primes.isPrime(1)); // 1 is not a prime number
        assertTrue(Primes.isPrime(2));  // 2 is a prime number
        assertTrue(Primes.isPrime(3));  // 3 is a prime number
        assertFalse(Primes.isPrime(4)); // 4 is not a prime number, Error: Returns true
    }

    @Test
    void testSmallestPrimeFactor() {
        assertEquals(2, Primes.smallestPrimeFactor(4));    // Expected: 2
        assertEquals(3, Primes.smallestPrimeFactor(9));    // Expected: 3
        assertEquals(5, Primes.smallestPrimeFactor(25));   // Expected: 5
        assertEquals(-1, Primes.smallestPrimeFactor(-10)); // Expected: -1
    }

    @Test
    void testSieveOfEratosthenes() {
        assertTrue(Primes.sieveOfEratosthenes(2));  // Expected: true
        assertTrue(Primes.sieveOfEratosthenes(3));  // Expected: true
        assertFalse(Primes.sieveOfEratosthenes(4)); // Expected: false
        assertTrue(Primes.sieveOfEratosthenes(5));  // Expected: true
        assertFalse(Primes.sieveOfEratosthenes(1)); // Expected: false
    }
}
