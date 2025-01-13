import java.util.Scanner;

public class CheckSpringSeason {

    //Method to check
    public static void checkSpringSeason(int month, int day) {
        if (month == 3 && day >= 20 || month == 4 || month == 5 || (month == 6 && day <= 20)) {
            // Display message for Spring Season
            System.out.println("It's a Spring Season");
        } else {
            // Display message for not Spring Season
            System.out.println("Not a Spring Season");
        }
    }

    public static void main(String[] args) {
        // Creating a Scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // Taking month and day as input from the user
        System.out.println("Enter the month");
        int month = input.nextInt();
        
        System.out.println("Enter the day");
        int day = input.nextInt();

        // Calling the method to check if it's Spring Season
        checkSpringSeason(month, day);

        // Closing the scanner
        input.close();
    }
}
