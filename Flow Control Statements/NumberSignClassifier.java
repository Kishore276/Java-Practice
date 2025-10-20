import java.util.Scanner;

public class NumberSignClassifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int inputValue = scanner.nextInt();

        if (inputValue > 0) {
            System.out.println(inputValue + " is Positive");
        } else if (inputValue < 0) {
            System.out.println(inputValue + " is Negative");
        } else {
            System.out.println("The number is Zero");
        }

        scanner.close();
    }
}