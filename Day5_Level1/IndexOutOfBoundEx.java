import java.util.*;  // Import the Scanner class for taking user input
import java.lang.StringIndexOutOfBoundsException;  // Import the StringIndexOutOfBoundsException class (though it's part of java.lang package by default)

// Define the class IndexOutOfBoundEx
class IndexOutOfBoundEx {
    
    // Method to handle the StringIndexOutOfBoundsException
    public static void ExceptionHandle(String str) {
        // Get the length of the string
        int len = str.length();
        
        try {
            // Attempt to access the character at the index 'len' which is out of bounds
            // Since string indices are 0-based, this will throw an exception
            str.charAt(len);
        }
        catch (StringIndexOutOfBoundsException ex) {
            // Catch the StringIndexOutOfBoundsException if it occurs
            // Print a message indicating that the index is out of bounds
            System.out.println("We are accessing an index that is out of bounds: " + ex.getMessage());
        }
    }

    // Main method: the entry point of the program
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner ob = new Scanner(System.in);
        
        // Declare a String variable 'str' to store the user's input
        String str;
        
        // Prompt the user to enter a string
        System.out.println("Please Enter the String");
        
        // Read the user input and assign it to 'str'
        str = ob.next();
        
        // Call the method 'ExceptionHandle' with the user's string
        // This will demonstrate how the program handles StringIndexOutOfBoundsException
        ExceptionHandle(str);
    }
}
