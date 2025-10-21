import java.util.Scanner;

public class TextCaseTransformer {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a single alphabet character: ");
        char inputChar = reader.next().charAt(0);

        if (inputChar >= 'a' && inputChar <= 'z') {
            System.out.println(inputChar + " -> " + Character.toUpperCase(inputChar));
        } else if (inputChar >= 'A' && inputChar <= 'Z') {
            System.out.println(inputChar + " -> " + Character.toLowerCase(inputChar));
        } else {
            System.out.println("Invalid input! Please enter an alphabet character.");
        }

        reader.close();
    }
}
