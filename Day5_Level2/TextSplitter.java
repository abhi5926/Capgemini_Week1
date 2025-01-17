import java.util.Scanner;

class TextSplitter {

    // Method to find the length of the String without using the built-in length() method
    public static int findLength(String text) {
        int length = 0;
        try {
            while (true) {
                text.charAt(length); // Try to access the next character
                length++; // Increase the length
            }
        } catch (StringIndexOutOfBoundsException e) {
            // When the index exceeds the length, exit the loop
        }
        return length;
    }

    // Method to split the text into words using charAt() and without using split() method
    public static String[] customSplit(String text) {
        // Find the length of the text
        int length = findLength(text);

        // Count the number of words
        int wordCount = 1; // Start with 1 word, because the text contains at least one word
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        // Create an array to store the indexes of spaces
        int[] spaceIndexes = new int[wordCount - 1]; // We need space indexes to extract words
        int spaceIndexCount = 0;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[spaceIndexCount++] = i;
            }
        }

        // Create an array to store the words
        String[] words = new String[wordCount];
        int startIndex = 0;
        int wordIndex = 0;

        // Extract the words from the text using the space indexes
        for (int i = 0; i < wordCount - 1; i++) {
            words[wordIndex++] = text.substring(startIndex, spaceIndexes[i]);
            startIndex = spaceIndexes[i] + 1;
        }
        // Add the last word after the final space
        words[wordIndex] = text.substring(startIndex);

        return words;
    }

    // Method to compare two String arrays and return a boolean
    public static boolean compareStringArrays(String[] array1, String[] array2) {
        if (array1.length != array2.length) {
            return false;
        }

        for (int i = 0; i < array1.length; i++) {
            if (!array1[i].equals(array2[i])) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a text: ");
        String inputText = scanner.nextLine();

        // Use custom split method to split text into words
        String[] customWords = customSplit(inputText);

        // Use built-in split method to split text into words
        String[] splitWords = inputText.split(" ");

        // Compare the results of the two methods
        boolean isEqual = compareStringArrays(customWords, splitWords);

        // Display the results
        System.out.println("Words using custom split method:");
        for (String word : customWords) {
            System.out.println(word);
        }

        System.out.println("\nWords using built-in split() method:");
        for (String word : splitWords) {
            System.out.println(word);
        }

        System.out.println("\nAre the results the same? " + isEqual);
    }
}
