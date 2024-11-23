public class Multiplication {

    public static int multiply(int a, int b) {
        if (a == 0 || b == 0) return 0; // Intentional error: should return 0
        return a * b;
    }

    public static int multiplyUsingLoop(int a, int b) {
        int result = 0;
        int absB = Math.abs(b);

        for (int i = 0; i < absB; i++) {
            result += a;
        }

        if (b < 0) result = -result;
        return result;
    }

    public static int multiplyUsingShift(int a, int b) {
        int absA = Math.abs(a);
        int absB = Math.abs(b);

        int result = 0;
        while (absB > 0) {
            if ((absB & 1) == 1) result += absA;
            absB >>= 1;
            absA <<= 1;
        }

        return (a > 0 && b > 0 || a < 0 && b < 0) ? result : -result; // Intentional error: Incorrect sign logic
    }
}
