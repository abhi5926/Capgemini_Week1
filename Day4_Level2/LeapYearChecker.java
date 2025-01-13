import java.util.Scanner;

public class LeapYearChecker{

    //Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        //Check year is divisible by 4 and 400 and not divisible by 100
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        // Creating a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Taking the year input from the user
        System.out.println("Enter a year:");
        int year = input.nextInt();

        // Checking if the year is valid (year >= 1582)
        if (year < 1582) {
            System.out.println("Year must be greater than or equal to 1582.");
        } else {
            // Calling the method to check if the year is a leap year
            if (isLeapYear(year)) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is not a Leap Year.");
            }
        }

        // Closing the scanner
        input.close();
    }
}
