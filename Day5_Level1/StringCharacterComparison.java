import java.util.Scanner;  // Import Scanner for taking user input
import java.util.Arrays;   // Import Arrays class for array operations

// Main class for String character comparison
class StringCharacterComparison {

    // Method to convert a String into a char array without using toCharArray()
    public static char[] getCharWithoutToCharArray(String str) {
        int n = str.length();  // Get the length of the string
        char[] str1 = new char[n];  // Create a new char array with the same length as the string

        // Loop through each character of the string and store it in the char array
        for (int i = 0; i < n; i++) {
            str1[i] = str.charAt(i);  // Use charAt() to get the character at index i
        }
        
        return str1;  // Return the char array containing the string's characters
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  // Create Scanner object for user input
        String str;  // Declare a String variable to store user input
        
        // Prompt the user to enter a string
        System.out.println("Enter the string");
        str = input.nextLine();  // Read the full line of input from the user
        
        // Call the custom method to convert the string to a char array
        char[] str1 = getCharWithoutToCharArray(str);

        // Use the built-in toCharArray() method to convert the string to a char array
        char[] str2 = str.toCharArray();

        // Compare both char arrays using Arrays.equals() to check if their contents are the same
        boolean result = Arrays.equals(str1, str2);

        // Output the result of the comparison
        if (result) {
            // If arrays are the same, print this message
            System.out.println("Both Arrays are same");
        } else {
            // If arrays are not the same, print this message
            System.out.println("Both arrays are not same");
        }
    }
}
