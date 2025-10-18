import java.util.Arrays;

public class DataSortingUtility {
    public static void main(String[] args) {
        int[] integerList = { 25, 10, 45, 32, 18 };

        System.out.println("Original array: ");
        for (int value : integerList) {
            System.out.print(value + " ");
        }

        Arrays.sort(integerList);

        System.out.println("\nSorted array: ");
        for (int value : integerList) {
            System.out.print(value + " ");
        }
    }
}
