import java.util.Scanner;
import java.util.Arrays;

public class LargestAndSecondLargestFind {
    public static void main(String[] args) {
        // Initialize Scanner to take input from user
        Scanner scanner = new Scanner(System.in);

        // Take input number from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Define maximum size of the array and initialize the array
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        
        // Initialize index variable
        int index = 0;

        // Extract digits of the number and store in the array
        while (number != 0) {
            if (index == maxDigit) {
                // If the index reaches maxDigit, increase maxDigit size by 10
                maxDigit += 10;
                
                // Create a new temporary array with increased size
                int[] temp = new int[maxDigit];
                
                // Copy the contents of the old array to the new one
                System.arraycopy(digits, 0, temp, 0, digits.length);
                
                // Reassign the digits array to the newly created temp array
                digits = temp;
            }
            
            digits[index] = number % 10;  // Get the last digit
            number = number / 10;          // Remove the last digit from the number
            index++;                       // Increment index
        }

        // Initialize variables to store largest and second largest digits
        int largest = -1, secondLargest = -1;

        // Loop through the array to find the largest and second largest digits
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Display the largest and second largest digits
        if (secondLargest == -1) {
            System.out.println("There is no second largest digit.");
        } else {
            System.out.println("Largest digit: " + largest);
            System.out.println("Second largest digit: " + secondLargest);
        }

        // Close scanner
        scanner.close();
    }
}
