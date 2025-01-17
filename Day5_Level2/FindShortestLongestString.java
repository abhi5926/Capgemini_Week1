import java.util.Scanner;

class FindShortestLongestString {

    // Method to find the length of a string without using the built-in length() method
    public static int findStringLength(String text) {
        int length = 0;
        try {
            while (true) {
                text.charAt(length); // Try accessing each character until it throws an exception
                length++;
            }
        } catch (IndexOutOfBoundsException e) {
            // Exit loop when the exception occurs
        }
        return length;
    }

    // Method to split the text into words without using the built-in split() method
    public static String[] splitTextIntoWords(String text) {
        int length = findStringLength(text);
        int wordCount = 0;

        // Counting the number of words by checking spaces
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }
        wordCount++; // Adding one more word for the last word

        String[] words = new String[wordCount];
        int start = 0;
        int wordIndex = 0;

        // Extracting words based on space positions
        for (int i = 0; i <= length; i++) {
            if (i == length || text.charAt(i) == ' ') {
                words[wordIndex] = text.substring(start, i);
                wordIndex++;
                start = i + 1;
            }
        }

        return words;
    }

    // Method to create a 2D array of words and their corresponding lengths
    public static String[][] getWordsWithLengths(String[] words) {
        String[][] wordWithLengths = new String[words.length][2];

        // Iterating through the words array and storing the word and its length
        for (int i = 0; i < words.length; i++) {
            wordWithLengths[i][0] = words[i];  // Word
            wordWithLengths[i][1] = String.valueOf(findStringLength(words[i]));  // Length as String
        }

        return wordWithLengths;
    }

    // Method to find the shortest and longest word lengths
    public static int[] findShortestAndLongest(String[][] wordWithLengths) {
        int shortestIndex = 0;
        int longestIndex = 0;

        for (int i = 1; i < wordWithLengths.length; i++) {
            int currentLength = Integer.parseInt(wordWithLengths[i][1]);

            // Update shortest index
            if (currentLength < Integer.parseInt(wordWithLengths[shortestIndex][1])) {
                shortestIndex = i;
            }

            // Update longest index
            if (currentLength > Integer.parseInt(wordWithLengths[longestIndex][1])) {
                longestIndex = i;
            }
        }

        return new int[]{shortestIndex, longestIndex};
    }

    // Method to display the result
    public static void displayResult(String[][] wordWithLengths, int[] shortestAndLongest) {


        // Display words with their corresponding lengths
        for (int i = 0; i < wordWithLengths.length; i++) {
            String word = wordWithLengths[i][0];
            String length = wordWithLengths[i][1];
            System.out.printf("%-15s %-5d\n", word, Integer.parseInt(length));
        }

        // Display shortest and longest words
        System.out.println("\nShortest Word: " + wordWithLengths[shortestAndLongest[0]][0] +
                " with length " + wordWithLengths[shortestAndLongest[0]][1]);
        System.out.println("Longest Word: " + wordWithLengths[shortestAndLongest[1]][0] +
                " with length " + wordWithLengths[shortestAndLongest[1]][1]);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.println("Enter a text:");
        String inputText = scanner.nextLine();

        // Split the text into words using the user-defined method
        String[] words = splitTextIntoWords(inputText);

        // Get the words and their lengths in a 2D array
        String[][] wordWithLengths = getWordsWithLengths(words);

        // Find the shortest and longest words using the 2D array
        int[] shortestAndLongest = findShortestAndLongest(wordWithLengths);

        // Display the result
        displayResult(wordWithLengths, shortestAndLongest);

        scanner.close();
    }
}
