import java.util.Scanner;  // Import Scanner class for user input
import java.lang.NumberFormatException;  // Import the NumberFormatException class

// Class definition for handling NumberFormatException
class NumberFormatEx {

    // Method to generate NumberFormatException
    public static void generateException(String str) {
        // Try to convert the input string into an integer
        // If the string does not represent a valid number, this will throw NumberFormatException
        int number = Integer.parseInt(str);

        // Print the number if conversion is successful
        System.out.println("The number " + number);
    }

    // Method to handle NumberFormatException
    public static void ExceptionHandle(String str) {
        try {
            // Call the generateException method that may throw a NumberFormatException
            generateException(str);
        } catch (NumberFormatException ex) {
            // Catch the NumberFormatException and print an error message
            System.out.println("Invalid number. Please enter a valid number.");
        }
    }

    // Main method where the program starts execution
    public static void main(String[] args) {
        // Create a Scanner object for reading user input
        Scanner ob = new Scanner(System.in);

        // Declare a variable to hold the user input
        String str;

        // Prompt the user to enter a string
        System.out.println("Please Enter the string");

        // Read the input string from the user
        str = ob.nextLine();

        // Call the ExceptionHandle method to handle possible NumberFormatException
        ExceptionHandle(str);
    }
}
