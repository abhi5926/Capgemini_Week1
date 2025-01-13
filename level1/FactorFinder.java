import java.util.Scanner;

public class FactorFinder {

    public static void main(String[] args) {
        // Scanner to take user input
        Scanner scanner = new Scanner(System.in);
        
        // Input the number from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Initializing maxFactor, factors array, and index
        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int index = 0;

        // Loop through 1 to the number to find the factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) { // If i is a factor of number
                
                if (index == maxFactor) { // Check if the array is full
                    // Double the size of the array if it's full
                    maxFactor *= 2;
                    int[] temp = new int[maxFactor];
                    // Copy the old factors array into the new temp array
                    System.arraycopy(factors, 0, temp, 0, factors.length);
                    // Assign temp back to factors
                    factors = temp;
                }
                factors[index++] = i;
            }
        }

        // Display the factors
        System.out.print("The factors of " + number + " are: ");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
        System.out.println(); // New line after displaying factors

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
