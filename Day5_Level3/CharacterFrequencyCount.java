import java.util.Scanner;

class CharacterFrequencyCount {

    // Method to find the frequency of characters in a string using charAt() and return a 2D array
    public static String[][] findCharacterFrequency(String text) {
        // Array to store the frequency of each character (ASCII values)
        int[] frequency = new int[256]; // ASCII size (256 characters)

        // Loop through the string and count frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            frequency[currentChar]++; // Increment the frequency of the character
        }

        // Create a 2D array to store characters and their frequencies
        // We assume that the string contains only visible ASCII characters.
        // Temporary array to store unique characters and their frequencies
        int uniqueCount = 0;

        // Count how many unique characters there are
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                uniqueCount++;
            }
        }

        // Create a 2D array to store characters and their frequencies
        String[][] result = new String[uniqueCount][2];
        int index = 0;

        // Loop through the frequency array to fill the result 2D array
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                result[index][0] = String.valueOf((char) i); // Store the character
                result[index][1] = String.valueOf(frequency[i]); // Store the frequency
                index++;
            }
        }

        return result; // Return the 2D array with characters and frequencies
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
