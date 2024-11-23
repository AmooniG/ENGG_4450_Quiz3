public class Primes {

    public static boolean isPrime(int number) {
        if (number < 2) return false;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) return false; // Intentional error: should return false
        }
        return true;
    }

    public static int smallestPrimeFactor(int number) {
        if (number <= 1) return -1; // No prime factors for 0, 1, or negatives
        for (int i = 2; i <= number; i++) {
            if (number % i == 0) return i;
        }
        return number;
    }

    public static boolean sieveOfEratosthenes(int number) {
        if (number <= 1) return false; // Numbers less than 2 are not prime
        boolean[] primes = new boolean[number + 1]; // Corrected: Add +1 to include `number`
        for (int i = 2; i <= number; i++) primes[i] = true;

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (primes[i]) {
                for (int j = i * i; j <= number; j += i) { // Corrected loop bounds
                    primes[j] = false;
                }
            }
        }
        return primes[number]; // Corrected: Check `primes[number]`
    }
}
