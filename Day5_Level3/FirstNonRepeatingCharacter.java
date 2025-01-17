import java.util.Scanner;

class FirstNonRepeatingCharacter {

    // Method to find the first non-repeating character in the string
    public static char findFirstNonRepeatingCharacter(String text) {
        // Array to store the frequency of characters (assuming ASCII characters)
        int[] frequency = new int[256];  // Array of size 256 to cover all ASCII characters

        // Loop through the string to count the frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            frequency[currentChar]++;  // Increment the count for the current character
        }

        // Loop through the string again to find the first character with frequency 1
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (frequency[currentChar] == 1) {
                return currentChar;  // Return the first non-repeating character
            }
        }

        // Return a special character if no non-repeating character is found
        return '\0';  // Indicates no non-repeating character
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String inputText = scanner.nextLine();

        // Find the first non-repeating character
        char result = findFirstNonRepeatingCharacter(inputText);

        // Display the result
        if (result != '\0') {
            System.out.println("The first non-repeating character is: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }

        scanner.close();
    }
}
