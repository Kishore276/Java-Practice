import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {
        int[] dataList = { 1, 4, 34, 56, 7 };

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to search: ");
        int targetValue = input.nextInt();

        int foundPosition = -1;

        for (int counter = 0; counter < dataList.length; counter++) {
            if (dataList[counter] == targetValue) {
                foundPosition = counter;
                break;
            }
        }

        if (foundPosition == -1) {
            System.out.println(-1);
        } else {
            System.out.println("The number " + targetValue + " is found at index: " + foundPosition);
        }

        input.close();
    }
}
