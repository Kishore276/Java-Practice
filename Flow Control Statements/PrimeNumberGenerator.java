public class PrimeNumberGenerator {
    public static void main(String[] args) {
        System.out.println("Prime numbers between 10 and 99 are:");

        for (int currentNumber = 10; currentNumber <= 99; currentNumber++) {
            if (isPrime(currentNumber)) {
                System.out.println(currentNumber);
            }
        }
    }

    private static boolean isPrime(int numberToCheck) {
        if (numberToCheck <= 1) {
            return false;
        }

        for (int factor = 2; factor <= Math.sqrt(numberToCheck); factor++) {
            if (numberToCheck % factor == 0) {
                return false;
            }
        }

        return true;
    }
}
