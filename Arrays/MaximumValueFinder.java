import java.util.Arrays;
import java.util.Scanner;

public class MaximumValueFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] integerArray = new int[9];

        System.out.println("Enter 9 integer numbers:");
        for (int counter = 0; counter < 9; counter++) {
            integerArray[counter] = input.nextInt();
        }

        System.out.println("The given array is : " + Arrays.toString(integerArray));

        int largest = integerArray[0];
        for (int element : integerArray) {
            if (element > largest) {
                largest = element;
            }
        }

        System.out.println("The biggest number in the given array is " + largest);
        input.close();
    }
}
