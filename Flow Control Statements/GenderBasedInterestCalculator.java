public class GenderBasedInterestCalculator {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Please provide Gender and Age as command line arguments.");
            System.out.println("Example: java InterestCalculator Female 25");
            return;
        }

        String personGender = args[0];
        int personAge = Integer.parseInt(args[1]);
        double interestRate = 0.0;

        if (personGender.equalsIgnoreCase("Female")) {
            if (personAge >= 1 && personAge <= 58) {
                interestRate = 8.2;
            } else if (personAge >= 59 && personAge <= 100) {
                interestRate = 9.2;
            } else {
                System.out.println("Invalid age. Age should be between 1 and 100.");
                return;
            }
        } else if (personGender.equalsIgnoreCase("Male")) {
            if (personAge >= 1 && personAge <= 58) {
                interestRate = 8.4;
            } else if (personAge >= 59 && personAge <= 100) {
                interestRate = 10.5;
            } else {
                System.out.println("Invalid age. Age should be between 1 and 100.");
                return;
            }
        } else {
            System.out.println("Invalid gender. Please enter Male or Female.");
            return;
        }

        System.out.println("For a " + personGender + " of age " + personAge + ", the interest percentage is: " + interestRate + "%");
    }
}