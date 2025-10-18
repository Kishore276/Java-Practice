import java.util.Arrays;

public class ArrayLargestSmallest {
    public static void main(String[] args) {
        int[] valueArray = { 25, 10, 45, 32, 18, 50 };

        Arrays.sort(valueArray);

        int minFirst = valueArray[0];
        int minSecond = valueArray[1];
        int maxFirst = valueArray[valueArray.length - 1];
        int maxSecond = valueArray[valueArray.length - 2];

        System.out.println("Array elements: ");
        for (int value : valueArray) {
            System.out.print(value + " ");
        }

        System.out.println("\nSmallest two numbers: " + minFirst + ", " + minSecond);
        System.out.println("Largest two numbers: " + maxSecond + ", " + maxFirst);
    }
}
