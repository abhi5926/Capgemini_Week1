import java.util.Scanner;

public class TextToLowerCase {

    // Method to convert each character to lowercase using ASCII values
    public static String convertToLowerCase(String input) {
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            // Check if the character is an uppercase letter
            if (currentChar >= 'A' && currentChar <= 'Z') {
                // Convert it to lowercase by adjusting the ASCII value
                currentChar = (char) (currentChar + 32);
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
        
        // Convert the input text to lowercase using the custom method
        String customLowerCaseText = convertToLowerCase(inputText);
        
        // Convert the input text to lowercase using the built-in toLowerCase method
        String builtInLowerCaseText = inputText.toLowerCase();
        
        // Compare the results using the user-defined method
        boolean areStringsEqual = compareStrings(customLowerCaseText, builtInLowerCaseText);
        
        // Display the results of comparison
        System.out.println("Converted using custom method: " + customLowerCaseText);
        System.out.println("Converted using built-in method: " + builtInLowerCaseText);
        System.out.println("Are both results the same? " + areStringsEqual);
        
                
        // Close the scanner
        scanner.close();
    }
}
