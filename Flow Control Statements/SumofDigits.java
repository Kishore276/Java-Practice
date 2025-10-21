import java.util.Scanner;

public class SumofDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int inputValue = scanner.nextInt();

        int totalSum = 0;
        int originalNumber = inputValue;

        while (inputValue > 0) {
            int currentDigit = inputValue % 10;
            totalSum += currentDigit;
            inputValue /= 10;
        }

        System.out.println("The sum of digits of " + originalNumber + " is: " + totalSum);

        scanner.close();
    }
}
