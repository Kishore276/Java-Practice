import java.util.Scanner;

public class Read_a_character {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);

        System.out.print("Please enter a character: ");
        char inputChar = inputReader.next().charAt(0);

        if ((inputChar >= 'A' && inputChar <= 'Z') || (inputChar >= 'a' && inputChar <= 'z')) {
            System.out.println("Alphabet");
        } else if (inputChar >= '0' && inputChar <= '9') {
            System.out.println("Digit");
        } else {
            System.out.println("Special Character");
        }

        inputReader.close();
    }
}
