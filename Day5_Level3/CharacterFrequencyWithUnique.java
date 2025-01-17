import java.util.Scanner;

class CharacterFrequencyWithUnique {

    // Method to find unique characters in a string using nested loops
    public static char[] uniqueCharacters(String text) {
        int length = text.length();
        boolean isUnique;

        // Temporary array to store unique characters
        char[] uniqueCharsTemp = new char[length];
        int uniqueCount = 0;

        // Loop to find unique characters
        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            isUnique = true;

            // Check if the current character has appeared before
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            // If unique, store it in the temporary array
            if (isUnique) {
                uniqueCharsTemp[uniqueCount++] = currentChar;
            }
        }

        // Create an array with the exact size to store unique characters
        char[] uniqueChars = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            uniqueChars[i] = uniqueCharsTemp[i];
        }

        return uniqueChars;
    }

    // Method to find the frequency of unique characters in a string
    public static String[][] findCharacterFrequency(String text) {
        // Find the unique characters in the text
        char[] uniqueChars = uniqueCharacters(text);
        int length = uniqueChars.length;

        // Create a 2D array to store characters and their frequencies
        String[][] result = new String[length][2];

        // Loop through the unique characters to calculate their frequencies
        for (int i = 0; i < length; i++) {
            char currentChar = uniqueChars[i];
            int frequency = 0;

            // Loop through the text to count the frequency of the current character
            for (int j = 0; j < text.length(); j++) {
                if (text.charAt(j) == currentChar) {
                    frequency++;
                }
            }

            // Store the character and its frequency in the result array
            result[i][0] = String.valueOf(currentChar);
            result[i][1] = String.valueOf(frequency);
        }

        return result;
    }

    // Method to display the characters and their frequencies
    public static void displayCharacterFrequency(String[][] result) {


        // Loop through the 2D array and display each character with its frequency
        for (int i = 0; i < result.length; i++) {
            System.out.printf("   %s      |    %s%n", result[i][0], result[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the string
        System.out.print("Enter a string: ");
        String inputText = scanner.nextLine();

        // Find the character frequencies
        String[][] frequencyResults = findCharacterFrequency(inputText);

        // Display the character frequencies
        displayCharacterFrequency(frequencyResults);

        scanner.close();
    }
}
