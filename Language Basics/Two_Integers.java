public class Two_Integers {
    public static void main(String[] inputArgs) {
        if (inputArgs.length != 2) {
            System.out.println("Please provide exactly two integers as arguments.");
            return;
        }
        int firstNumber = Integer.parseInt(inputArgs[0]);
        int secondNumber = Integer.parseInt(inputArgs[1]);
        int totalSum = firstNumber + secondNumber;
        System.out.println("The sum of " + firstNumber + " and " + secondNumber + " is " + totalSum);
    }
}
