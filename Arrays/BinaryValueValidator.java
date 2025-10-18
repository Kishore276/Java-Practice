public class BinaryValueValidator {
    public static void main(String[] args) {
        int[] testData = { 1, 4, 1, 5, 4 };

        boolean isValid = true;

        for (int value : testData) {
            if (value != 1 && value != 4) {
                isValid = false;
                break;
            }
        }

        System.out.println(isValid);
    }
}
