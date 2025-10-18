import java.util.Arrays;

public class ArrangeEvenOddArray {
    public static void main(String[] args) {
        int[] dataArray = { 1, 0, 1, 0, 0, 1, 1 };
        int[] outputArray = new int[dataArray.length];
        int position = 0;

        for (int element : dataArray) {
            if (element % 2 == 0) {
                outputArray[position++] = element;
            }
        }

        for (int element : dataArray) {
            if (element % 2 != 0) {
                outputArray[position++] = element;
            }
        }

        System.out.println(Arrays.toString(outputArray));
    }
}
