import java.util.Scanner;

public class DigitFrequency {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for a number
        System.out.print("Enter a number");
        long number = scanner.nextLong();

        // Convert the number into a string to easily access each digit
        String numStr = String.valueOf(number);

        // Initialize an array to store the frequency of each digit (0 to 9)
        int[] frequency = new int[10];

        // Loop through each character in the string representation of the number
        for (int i = 0; i < numStr.length(); i++) {
            // Get the digit at the current position
            char digitChar = numStr.charAt(i);
            int digit = digitChar - '0';  // Convert char to int

            // Increment the corresponding frequency of the digit
            frequency[digit]++;
        }

        // Display the frequency of each digit
        System.out.println("\nFrequency of each digit in the number:");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {  // Only print the digits that appear in the number
                System.out.println("Digit " + i + ": " + frequency[i]);
            }
        }

        
    }
}
