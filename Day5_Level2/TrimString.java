import java.util.Scanner;

 class TrimString {

    // Method to trim leading and trailing spaces using charAt()
    public static int[] trimSpaces(String text) {
        int start = 0;
        int end = text.length() - 1;

        // Find the index where the first non-space character occurs
        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }

        // Find the index where the last non-space character occurs
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }

        // Return the start and end points in an array
        return new int[] {start, end};
    }

    // Method to create a substring using charAt() method
    public static String createSubstring(String text, int start, int end) {
        StringBuilder result = new StringBuilder();

        // Create the substring by appending characters between the start and end indices
        for (int i = start; i <= end; i++) {
            result.append(text.charAt(i));
        }

        return result.toString();
    }

    // Method to compare two strings using charAt() method
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        // Compare each character in both strings
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.println("Enter a text with leading and trailing spaces:");
        String inputText = scanner.nextLine();

        // Trimming the string using the charAt() method
        int[] trimPoints = trimSpaces(inputText);
        String trimmedTextWithCharAt = createSubstring(inputText, trimPoints[0], trimPoints[1]);

        // Trimming the string using the built-in trim() method
        String trimmedTextBuiltIn = inputText.trim();

        // Compare the two trimmed strings
        boolean isEqual = compareStrings(trimmedTextWithCharAt, trimmedTextBuiltIn);

        // Display the results
        System.out.println("Trimmed using charAt(): " + trimmedTextWithCharAt);
        System.out.println("Trimmed using built-in trim(): " + trimmedTextBuiltIn);
        System.out.println("Are the two trimmed strings equal? " + isEqual);

        scanner.close();
    }
}
