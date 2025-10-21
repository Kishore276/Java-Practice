public class SequenceReverser {
    public static void main(String[] args) {
        if (args.length != 4) {
            System.out.println("Please enter 4 integer numbers");
            return;
        }

        int[] inputArray = new int[4];

        for (int index = 0; index < 4; index++) {
            inputArray[index] = Integer.parseInt(args[index]);
        }

        System.out.print("The given array is : ");
        for (int element : inputArray) {
            System.out.print(element + " ");
        }

        // Reverse the array
        for (int position = 0; position < inputArray.length / 2; position++) {
            int temporary = inputArray[position];
            inputArray[position] = inputArray[inputArray.length - 1 - position];
            inputArray[inputArray.length - 1 - position] = temporary;
        }

        System.out.print("\nThe reverse of the array is : ");
        for (int element : inputArray) {
            System.out.print(element + " ");
        }
    }
}
