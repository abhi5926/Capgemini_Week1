import java.util.Scanner;

public class ArraySum {

    public static void main(String[] args) {
        // Initialize scanner for user input
        Scanner scanner = new Scanner(System.in);
        
        // Array to store up to 10 double values
        double[] numbers = new double[10];
        
        // Variable to store the total sum
        double total = 0.0;
        
        // Index variable to keep track of the number of values entered
        int index = 0;

        // Infinite loop to take user input
        while (true) {
            // Ask the user for a number
            System.out.print("Enter a number (0 or negative number to stop): ");
            double userInput = scanner.nextDouble();

            // Break if input is 0 or negative, or if the array is full
            if (userInput <= 0 ) {
                break;
            }

            // Store the number in the array
            numbers[index] = userInput;
            index++;  // Increment the index
        }

        // Calculate the total sum of the numbers
        for (int i = 0; i < index; i++) {
            total += numbers[i];
        }

        // Display the numbers entered
        System.out.println("Numbers entered:");
        for (int i = 0; i < index; i++) {
            System.out.println("Position " + (i + 1) + " = " + numbers[i]);
        }

        // Display the total sum
        System.out.println("Total sum of numbers: " + total);

        // Close the scanner
        scanner.close();
    }
}
