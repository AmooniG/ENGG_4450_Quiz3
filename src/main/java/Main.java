public class Main {
    public static void main(String[] args) {
        System.out.println("Testing Multiplication:");
        System.out.println("4 * 5 = " + Multiplication.multiply(4, 5));
        System.out.println("4 * -5 = " + Multiplication.multiplyUsingLoop(4, -5));

        System.out.println("\nTesting Primes:");
        System.out.println("Is 5 prime? " + Primes.isPrime(5));
        System.out.println("Smallest prime factor of 10: " + Primes.smallestPrimeFactor(10));
    }
}
