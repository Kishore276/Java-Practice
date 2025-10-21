public class Strings {
    public static void main(String[] commandLineArgs) {
        if (commandLineArgs.length == 0) {
            System.out.println("Please provide a name as a command line argument.");
        } else {
            System.out.println("Welcome " + commandLineArgs[0]);
        }
    }
}
