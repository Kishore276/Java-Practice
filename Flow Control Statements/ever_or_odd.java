import java.util.Scanner;

public class ever_or_odd {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int userNumber = inputScanner.nextInt();

        if (userNumber % 2 == 0) {
            System.out.println(userNumber + " is Even");
        } else {
            System.out.println(userNumber + " is Odd");
        }

        inputScanner.close();
    }
}
