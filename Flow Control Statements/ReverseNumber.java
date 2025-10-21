import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int inputNumber = userInput.nextInt();

        int originalValue = inputNumber;
        int reversedNumber = 0;

        while (inputNumber > 0) {
            int lastDigit = inputNumber % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            inputNumber /= 10;
        }

        System.out.println("The reverse of " + originalValue + " is: " + reversedNumber);

        userInput.close();
    }
}
