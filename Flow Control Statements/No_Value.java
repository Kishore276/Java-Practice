public class No_Value {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No values");
        } else {
            for (int index = 0; index < args.length; index++) {
                System.out.print(args[index]);
                if (index < args.length - 1) {
                    System.out.print(",");
                }
            }
        }
    }
}
