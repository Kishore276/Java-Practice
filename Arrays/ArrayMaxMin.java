public class ArrayMaxMin {
    public static void main(String[] args) {
        int[] dataSet = { 25, 10, 45, 32, 18 };

        int maximum = dataSet[0];
        int minimum = dataSet[0];

        for (int item : dataSet) {
            if (item > maximum) {
                maximum = item;
            }
            if (item < minimum) {
                minimum = item;
            }
        }

        System.out.println("Array elements: ");
        for (int item : dataSet) {
            System.out.print(item + " ");
        }

        System.out.println("\nMaximum value: " + maximum);
        System.out.println("Minimum value: " + minimum);
    }
}
