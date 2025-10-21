import java.util.Arrays;

public class NumericFilterProcessor {
    public static void main(String[] args) {
        int[] inputData = { 1, 10, 10, 2 };

        int[] filteredArray = withoutTen(inputData);

        System.out.println("Array after removing 10's: " + Arrays.toString(filteredArray));
    }

    public static int[] withoutTen(int[] originalArray) {
        int[] cleanedArray = new int[originalArray.length];
        int position = 0;

        for (int element : originalArray) {
            if (element != 10) {
                cleanedArray[position] = element;
                position++;
            }
        }

        return cleanedArray;
    }
}
