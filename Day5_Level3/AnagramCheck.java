import java.util.Scanner;

class AnagramCheck {

    // Method to check if two strings are anagrams
    public static boolean areAnagrams(String text1, String text2) {
        // Step 1: Check if lengths are equal
        if (text1.length() != text2.length()) {
            return false;
        }

        // Step 2: Create arrays to store frequency of characters
        int[] frequency1 = new int[256];  // ASCII character set
        int[] frequency2 = new int[256];

        // Step 3: Loop through both strings to count character frequencies
        for (int i = 0; i < text1.length(); i++) {
            frequency1[text1.charAt(i)]++;
            frequency2[text2.charAt(i)]++;
        }

        // Step 4: Compare the frequency arrays
        for (int i = 0; i < 256; i++) {
            if (frequency1[i] != frequency2[i]) {
                return false;  // If frequencies don't match, not anagrams
            }
        }

        // If all frequencies match, the strings are anagrams
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the two strings
        System.out.print("Enter the first text: ");
        String text1 = scanner.nextLine();

        System.out.print("Enter the second text: ");
        String text2 = scanner.nextLine();

        // Call the method to check if the strings are anagrams
        boolean result = areAnagrams(text1, text2);

        // Display the result
        if (result) {
            System.out.println("The texts are anagrams.");
        } else {
            System.out.println("The texts are not anagrams.");
        }

        scanner.close();
    }
}
