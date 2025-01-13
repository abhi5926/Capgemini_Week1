import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        // Initialize Scanner to take input from user
        Scanner scanner = new Scanner(System.in);

        // Take input number from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Find the count of digits in the number
        int temp = number;
        int count = 0;
        while (temp != 0) {
            temp /= 10;  // Remove last digit
            count++;     // Increment digit count
        }

        // Create an array to store the digits of the number
        int[] digits = new int[count];

        // Store digits of the number in the array
        temp = number;
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = temp % 10;  // Extract last digit
            temp /= 10;              // Remove last digit
        }

        // Display the digits in reverse order
        System.out.print("Digits in reverse order: ");
        for (int digit : digits) {
            System.out.print(digit);  // Print each digit
        }

        // Close the scanner
        scanner.close();
    }
}
