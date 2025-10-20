import java.util.Scanner;

public class Alphabetic_Order {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first character: ");
        char firstChar = input.next().charAt(0);
        System.out.print("Enter second character: ");
        char secondChar = input.next().charAt(0);

        if (firstChar < secondChar) {
            System.out.println(firstChar + "," + secondChar);
        } else {
            System.out.println(secondChar + "," + firstChar);
        }

        input.close();
    }
}
