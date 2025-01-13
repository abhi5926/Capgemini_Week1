import java.util.Scanner;

public class SumOfNaturalNumbers{

    //Method to calculate the sum of first n natural numbers using a loop
    public static int sumOfNaturalNumbers(int n) {
        int sum = 0;
        
        // Using a loop to sum the first n natural numbers
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        
        return sum;
    }

    public static void main(String[] args) {
        // Creating a Scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // Taking input from the user for the value of n
        System.out.println("Enter a positive integer n to find the sum of first n natural numbers:");
        int n = input.nextInt();
        
        // Calling the method to find the sum of natural numbers
        int result = sumOfNaturalNumbers(n);
        
        // Displaying the result
        System.out.println("The sum of the first " + n + " natural numbers is: " + result);
        
        // Closing the scanner
        input.close();
    }
}
