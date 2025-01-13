import java.util.Scanner;

public class NumberCheckPositiveNegative {

    // Method to check if the number is positive, negative, or zero
    public static int checkNumber(int number) {
        if (number > 0) {
            return 1;  
        } else if (number < 0) {
            return -1; 
        } else {
            return 0;  
        }
    }

    public static void main(String[] args) {
        //Creating a Scanner object for user input
        Scanner input = new Scanner(System.in);

        //Taking input from the user
        System.out.println("Enter an integer:");
        int number = input.nextInt();

        //Calling the method to check the number and storing the result
        int result = checkNumber(number);

        //Displaying the result 
        if (result == 1) {
            System.out.println("The number is positive.");
        } else if (result == -1) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        // Closing the scanner
        input.close();
    }
}
