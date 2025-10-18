public class AsciiArray {
    public static void main(String[] args) {
        int[] charCodes = { 65, 66, 67, 68, 101 };

        System.out.print("Characters: ");
        for (int code : charCodes) {
            System.out.print((char) code + " ");
        }
    }
}
