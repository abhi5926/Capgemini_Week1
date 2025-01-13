// Importing Scanner class for input
import java.util.Scanner;

class IntOperation{
    
    public static void main(String args[]){
        
        // Creating a Scanner object 
        Scanner input = new Scanner(System.in);
    
        // Declearing integer variables to store the numbers
        int a, b ,c;
        
        // Display message enter the first number
        System.out.println("Enter first number");
        a = input.nextInt();
        
        // Display message enter the second number
        System.out.println("Enter second number");
        
        // Storing the second number
        b = input.nextInt();
		
        // Display message enter the third number
        System.out.println("Enter third number");
        
        // Storing the third number
        c = input.nextInt();
        //Performing operation 1 and storing result in operation1 variable of type int
	    int operation1 = a + (b*c);
        
		 //Performing operation 2 and storing result in operation2 variable of type int
	    int operation2 = (a*b) + c;
		 //Performing operation 3 and storing result in operation3 variable of type int
	    int operation3 = c + (a / b);
		 //Performing operation 4 and storing result in operation4 variable of type int
		int operation4 =  (a % b) + c;
        
        // Displaying the  to the user operations a + b *c, a * b + c, c + a / b, and a % b + c result to user
        System.out.println("operation   a + b *c result is "+operation1+"\n"+"operation  a * b + c  result is "+operation2+"\n"+"operation  c + a / b,  result is "+operation3+"\n"+"operation   a % b + c result is "+operation4);
    }
}
