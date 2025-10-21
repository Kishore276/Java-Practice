import java.util.Arrays;

public class MiddleElementinArray {
    public static void main(String[] args) {
        int[] firstArray = { 1, 2, 3 };
        int[] secondArray = { 4, 7, 6 };

        int[] middleElements = middleWay(firstArray, secondArray);

        System.out.println("New array with middle elements: " + Arrays.toString(middleElements));
    }

    public static int[] middleWay(int[] arrayOne, int[] arrayTwo) {
        int[] outputArray = new int[2];
        outputArray[0] = arrayOne[1]; // middle of first array
        outputArray[1] = arrayTwo[1]; // middle of second array
        return outputArray;
    }
}
