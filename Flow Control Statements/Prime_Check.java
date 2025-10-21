import java.util.Scanner;

public class Prime_Check {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int testNumber = inputScanner.nextInt();

        if (testNumber <= 1) {
            System.out.println(testNumber + " is not a prime number.");
            inputScanner.close();
            return;
        }

        boolean primeFlag = true;

        for (int divisor = 2; divisor <= testNumber / 2; divisor++) {
            if (testNumber % divisor == 0) {
                primeFlag = false;
                break;
            }
        }

        if (primeFlag) {
            System.out.println(testNumber + " is a prime number.");
        } else {
            System.out.println(testNumber + " is not a prime number.");
        }

        inputScanner.close();
    }
}
