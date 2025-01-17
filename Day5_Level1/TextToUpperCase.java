import java.util.Scanner;

public class TextToUpperCase {
    
    // Method to convert lowercase letters to uppercase using ASCII value differences
    public static String convertToUpperCase(String input) {
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            // Check if the character is a lowercase letter
            if (currentChar >= 'a' && currentChar <= 'z') {
                // Convert it to uppercase by adjusting the ASCII value
                currentChar = (char) (currentChar - 32);
            }
            result.append(currentChar);
        }
        
        return result.toString();
    }
    
    // Method to compare two strings using charAt()
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Take the input text
        System.out.print("Enter text: ");
        String inputText = scanner.nextLine();
        
        // Convert the input text to uppercase using the custom method
        String customUpperCaseText = convertToUpperCase(inputText);
        
        // Convert the input text to uppercase using the built-in toUpperCase method
        String builtInUpperCaseText = inputText.toUpperCase();
        
        // Compare the results using the user-defined method
        boolean areStringsEqual = compareStrings(customUpperCaseText, builtInUpperCaseText);
        
        // Display the results
        System.out.println("Converted using custom method: " + customUpperCaseText);
        System.out.println("Converted using built-in method: " + builtInUpperCaseText);
        System.out.println("Are both results the same? " + areStringsEqual);
        
        // Close the scanner
        scanner.close();
    }
}
