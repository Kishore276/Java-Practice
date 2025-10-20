import java.util.Scanner;

public class DigitComparisonTool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first non-negative integer: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter second non-negative integer: ");
        int secondNumber = scanner.nextInt();

        int firstDigit = firstNumber % 10;
        int secondDigit = secondNumber % 10;

        boolean isSame = (firstDigit == secondDigit);

        System.out.println("Do " + firstNumber + " and " + secondNumber + " have the same last digit? " + isSame);

        scanner.close();
    }
}
