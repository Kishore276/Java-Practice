import java.util.Scanner;

public class Months {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter month number (1-12): ");
        if (!userInput.hasNextInt()) {
            System.out.println("Please enter the month in numbers");
            userInput.close();
            return;
        }

        int monthNumber = userInput.nextInt();
        String monthTitle;

        switch (monthNumber) {
            case 1:
                monthTitle = "January";
                break;
            case 2:
                monthTitle = "February";
                break;
            case 3:
                monthTitle = "March";
                break;
            case 4:
                monthTitle = "April";
                break;
            case 5:
                monthTitle = "May";
                break;
            case 6:
                monthTitle = "June";
                break;
            case 7:
                monthTitle = "July";
                break;
            case 8:
                monthTitle = "August";
                break;
            case 9:
                monthTitle = "September";
                break;
            case 10:
                monthTitle = "October";
                break;
            case 11:
                monthTitle = "November";
                break;
            case 12:
                monthTitle = "December";
                break;
            default:
                monthTitle = "Invalid month";
                break;
        }

        System.out.println(monthTitle);
        userInput.close();
    }
}
