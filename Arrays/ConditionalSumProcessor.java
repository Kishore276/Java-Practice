public class ConditionalSumProcessor {
    public static void main(String[] args) {
        int[] dataValues = { 10, 3, 6, 1, 2, 7, 9 };

        int totalValue = 0;
        boolean skipFlag = false;

        for (int currentElement : dataValues) {
            if (currentElement == 6) {
                skipFlag = true;
                continue;
            }
            if (currentElement == 7 && skipFlag) {
                skipFlag = false;
                continue;
            }
            if (!skipFlag) {
                totalValue += currentElement;
            }
        }

        System.out.println("The sum of array elements is: " + totalValue);
    }
}
