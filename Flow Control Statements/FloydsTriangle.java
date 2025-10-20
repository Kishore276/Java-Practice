import java.util.Scanner;

public class FloydsTriangle {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter an integer number: ");
        int totalRows = userInput.nextInt();

        System.out.println("Floyd's Triangle of " + totalRows + " rows:");
        System.out.println("\nUsing for loop:");
        for (int rowIndex = 1; rowIndex <= totalRows; rowIndex++) {
            for (int colIndex = 1; colIndex <= rowIndex; colIndex++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("\nUsing while loop:");
        int currentRow = 1;
        while (currentRow <= totalRows) {
            int currentCol = 1;
            while (currentCol <= currentRow) {
                System.out.print("* ");
                currentCol++;
            }
            System.out.println();
            currentRow++;
        }

        userInput.close();
    }
}
