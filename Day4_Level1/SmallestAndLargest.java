import java.util.Scanner;

public class SmallestAndLargest{

    // Method to find the smallest and largest of three numbers
    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
        int[] result = new int[2];  // Array to store the smallest and largest numbers
        
        // Finding the smallest and largest
        result[0] = Math.min(number1, Math.min(number2, number3));  // Smallest
        result[1] = Math.max(number1, Math.max(number2, number3));  // Largest
        
        return result;
    }

    public static void main(String[] args) {
        // Creating a Scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // Taking 3 numbers as input from the user
        System.out.println("Enter the first number");
        int number1 = input.nextInt();
        
        System.out.println("Enter the second number");
        int number2 = input.nextInt();
        
        System.out.println("Enter the third number");
        int number3 = input.nextInt();
        
        // Calling the method to find the smallest and largest
        int[] result = findSmallestAndLargest(number1, number2, number3);
        
        // Displaying the result
        System.out.println("The smallest number is: " + result[0]);
        System.out.println("The largest number is: " + result[1]);
        
        // Closing the scanner
        input.close();
    }
}
