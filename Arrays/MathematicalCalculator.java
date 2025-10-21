public class MathematicalCalculator {
    public static void main(String[] args) {
        int[] valueSet = { 10, 20, 30, 40, 50 };

        int totalSum = 0;

        for (int element : valueSet) {
            totalSum += element;
        }

        double meanValue = (double) totalSum / valueSet.length;
        System.out.println("Array elements: ");
        for (int element : valueSet) {
            System.out.print(element + " ");
        }
        System.out.println("\nSum of array elements: " + totalSum);
        System.out.println("Average of array elements: " + meanValue);
    }
}