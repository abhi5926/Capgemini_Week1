// Importing Scanner class for input
import java.util.Scanner;

class CalculateQuotientRemainder{
    
    public static void main(String args[]){
        
        // Creating a Scanner object 
        Scanner input = new Scanner(System.in);
    
        // Declearing integer variables to store the numbers
        int number1, number2;
        
        // Display message enter the first number
        System.out.println("Enter first number");
        number1 = input.nextInt();
        
        // Display message enter the second number
        System.out.println("Enter second number");
        
        // Storing the second number
        number2 = input.nextInt();
        
        // Calculating the remainder 
        int remainder = number1 % number2;
        
        // Calculating the quotient 
        int quotient = number1 / number2;
        
        // Displaying the quotient and remainder to the user
        System.out.println("The Quotient is "+quotient+" and Reminder is "+remainder+" of two number "+number1+" and "+ number2);
    }
}
