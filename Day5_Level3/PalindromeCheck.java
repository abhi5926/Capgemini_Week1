import java.util.Scanner;

class PalindromeCheck {

    // Method 1: Iterative approach to check palindrome
    public static boolean isPalindromeIterative(String text) {
        int start = 0;
        int end = text.length() - 1;

        // Loop through the text and compare characters from start and end
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false; // Return false if characters don't match
            }
            start++;
            end--;
        }
        return true; // Return true if all characters match
    }

    // Method 2: Recursive approach to check palindrome
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        // Base case: If start index is greater than or equal to end index
        if (start >= end) {
            return true; // Text is palindrome
        }
        // If characters at start and end are not equal, return false
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        // Recursive case: Check the next characters
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    // Method 3: Check palindrome using character arrays
    public static boolean isPalindromeUsingCharArray(String text) {
        char[] charArray = text.toCharArray();
        int length = charArray.length;

        // Create a reverse array by reversing the original character array
        char[] reverseArray = new char[length];
        for (int i = 0; i < length; i++) {
            reverseArray[i] = charArray[length - 1 - i];
        }

        // Compare the original character array with the reversed array
        for (int i = 0; i < length; i++) {
            if (charArray[i] != reverseArray[i]) {
                return false; // If characters don't match, return false
            }
        }
        return true; // If all characters match, return true
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the string
        System.out.print("Enter a string: ");
        String inputText = scanner.nextLine();

        // Check palindrome using Iterative method
        boolean resultIterative = isPalindromeIterative(inputText);
        System.out.println("Palindrome (Iterative): " + resultIterative);

        // Check palindrome using Recursive method
        boolean resultRecursive = isPalindromeRecursive(inputText, 0, inputText.length() - 1);
        System.out.println("Palindrome (Recursive): " + resultRecursive);

        // Check palindrome using Character Array method
        boolean resultCharArray = isPalindromeUsingCharArray(inputText);
        System.out.println("Palindrome (Character Array): " + resultCharArray);

        scanner.close();
    }
}
