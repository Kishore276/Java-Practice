import java.util.LinkedHashSet;

public class UniqueElementProcessor {
    public static void main(String[] args) {
        int[] dataSet = { 12, 34, 12, 45, 67, 89, 89, 34, 90, 34 };

        LinkedHashSet<Integer> distinctValues = new LinkedHashSet<>();
        for (int element : dataSet) {
            distinctValues.add(element);
        }

        System.out.print("Array without duplicates: ");
        for (int value : distinctValues) {
            System.out.print(value + " ");
        }
    }
}
