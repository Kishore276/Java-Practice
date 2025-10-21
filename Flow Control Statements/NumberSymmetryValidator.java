import java.util.Scanner;

public class NumberSymmetryValidator {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int inputNumber = inputReader.nextInt();
        int originalValue = inputNumber;
        int reversedValue = 0;

        while (inputNumber > 0) {
            int singleDigit = inputNumber % 10;
            reversedValue = reversedValue * 10 + singleDigit;
            inputNumber /= 10;
        }

        if (originalValue == reversedValue) {
            System.out.println(originalValue + " is a palindrome");
        } else {
            System.out.println(originalValue + " is not a palindrome");
        }

        inputReader.close();
    }
}
