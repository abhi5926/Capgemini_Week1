import java.util.*;  // Import the Scanner class to read user input
import java.lang.IllegalArgumentException;  // Import the IllegalArgumentException class (although it's part of java.lang package by default)

// Define the class IllegalArgumentEx
class IllegalArgumentEx {

    // Method to handle IllegalArgumentException
    public static void ExceptionHandle(String str) {
        // Attempting to call the 'substring' method with incorrect parameters
        // This will generate an IllegalArgumentException if the indices are invalid
        str.substring(str.length(), str.length()-2);  // Invalid index: first index is greater than second index
        
        try {
            // Inside the try block, we are trying to extract a substring with invalid arguments
            // This will throw an IllegalArgumentException
            str.substring(str.length(), str.length()-2);  // Invalid range for substring
        }
        catch (IllegalArgumentException ex) {
            // If an IllegalArgumentException is thrown, it will be caught here
            // The exception message is printed, indicating that the exception was caused by invalid indices
            System.out.println("IllegalArgumentException occurred due to: " + ex.getMessage());
        }
    }

    // Main method: entry point of the program
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner ob = new Scanner(System.in);
        
        // Declare a String variable 'str' to store the user input
        String str;
        
        // Prompt the user to enter a string
        System.out.println("Please enter the string:");
        
        // Read the user input and store it in the 'str' variable
        str = ob.nextLine();
        
        // Call the ExceptionHandle method to demonstrate the IllegalArgumentException
        ExceptionHandle(str);
    }
}
