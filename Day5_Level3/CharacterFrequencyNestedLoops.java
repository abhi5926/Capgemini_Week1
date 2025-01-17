import java.util.Scanner;

class CharacterFrequencyNestedLoops {

    // Method to find the frequency of characters in a string using nested loops
    public static String[] findCharacterFrequency(String text) {
        // Convert the string to a character array
        char[] charArray = text.toCharArray();
        int length = charArray.length;

        // Array to store the frequency of characters (initialize to zero)
        int[] frequency = new int[length];

        // String array to store characters and their frequencies
        String[] result = new String[length];

        // Outer loop: Iterate through each character in the text
        for (int i = 0; i < length; i++) {
            // Skip the character if it has already been counted
            if (frequency[i] == 0) {
                char currentChar = charArray[i];
                int count = 1; // Initialize frequency for the current character

                // Inner loop: Check for duplicates and count their occurrences
                for (int j = i + 1; j < length; j++) {
                    if (charArray[j] == currentChar) {
                        count++;
                        frequency[j] = -1; // Mark the character as counted
                    }
                }

                // Store the character and its frequency in the result array
                result[i] = currentChar + ": " + count;
                frequency[i] = -1; // Mark the character as counted
            }
        }

        return result;
    }

    // Method to display the frequency results
    public static void displayCharacterFrequency(String[] result) {
        System.out.println("Character | Frequency");
        System.out.println("----------------------");

        // Loop through the result array and print each character and its frequency
        for (String res : result) {
            if (res != null) {
                System.out.println(res);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the string
        System.out.print("Enter a string: ");
        String inputText = scanner.nextLine();

        // Find the character frequencies
        String[] frequencyResults = findCharacterFrequency(inputText);

        // Display the character frequencies
        displayCharacterFrequency(frequencyResults);

        scanner.close();
    }
}
