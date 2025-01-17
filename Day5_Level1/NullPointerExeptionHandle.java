import java.util.Scanner;  // Import the Scanner class to read input from the user
import java.lang.NullPointerException;  // Import the NullPointerException class (not necessary as it is already part of java.lang package)

// Define the class NullPointerEx
public class NullPointerExeptionHandle {

    // Method to demonstrate NullPointerException
    public static void exception(String str) {
        try {
            // Attempt to call the 'length()' method on the string 'str'
            // If 'str' is null, this will throw a NullPointerException
            str.length();
        } catch (NullPointerException ex) {
            // Catch the NullPointerException if it occurs
            // Print a message indicating that an exception occurred because 'str' was null
            System.out.println("Exception occurred during method call by str which is null: " + ex.getMessage());
        }
    }

    // Main method: entry point of the program
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Initialize a String variable 's' to null
        String s = null;

        // Call the 'exception' method with 's' as the argument, which is null
        exception(s);
    }
}
