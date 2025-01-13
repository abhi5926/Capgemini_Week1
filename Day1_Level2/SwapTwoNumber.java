
//importing Scanner class liberaries
import java.util.Scanner;
//Creating class name SwapTwoNumber for swap two numbers
class SwapTwoNumber{
    
    public static void main(String args[]){
        
        // Creating a Scanner object 
        Scanner input = new Scanner(System.in);
    
        // Declearing integer variables name number1 and number2
        
		int number1,number2;
        //Display message to the user to user input number1
       System.out.println("Enter the first number ");
	   //Taking input from user 
	  number1  = input.nextInt();
	   
	   
        //Display message to the user to user input
       System.out.println("Enter the second number ");
	   //Taking input from user
	   number2 = input.nextInt();
	   // Swapping values by taking temporary variable name temp
	   int temp = number1;
	   number1 = number2;
	   number2 = temp;
       //Display the swaped values of number1 and number2
		System.out.println( "The swapped numbers are "+number1+" and "+number2);
    }
}
