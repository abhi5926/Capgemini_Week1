//Importing Scanner class for input
import java.util.Scanner;

class CalculateQuotientRemainder{
    //Method to calculate the quotient and remainder
    public static void calculateQuotientAndRemainder(int number1, int number2) {
        // Calculating the remainder
        int remainder = number1 % number2;
        
        // Calculating the quotient
        int quotient = number1 / number2;
        
        // Displaying the quotient and remainder
        System.out.println("The Quotient is " + quotient + " and Remainder is " + remainder + " of two numbers " + number1 + " and " + number2);
    }

    public static void main(String args[]) {
        // Creating a Scanner object 
        Scanner input = new Scanner(System.in);
    
        // Declaring integer variables to store the numbers
        int number1, number2;
        
        // Display message enter the first number
        System.out.println("Enter first number");
        number1 = input.nextInt();
        
        // Display message enter the second number
        System.out.println("Enter second number");
        
        // Storing the second number
        number2 = input.nextInt();
        
        // Calling the method to calculate quotient and remainder
        calculateQuotientAndRemainder(number1, number2);
        
        // Closing the scanner
        input.close();
    }
}
