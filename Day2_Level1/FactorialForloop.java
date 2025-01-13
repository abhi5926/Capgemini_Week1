//Importing Scanner class liberaries
import java.util.Scanner;
// Creating class name FactorialForloop

public class FactorialForloop{
  public static void main(String[] args) {
  
       // Creating a Scanner class object 
       Scanner input = new Scanner(System.in);
        
      // Declaring variable number of type int
      int number ;
	   
      //Taking number as input 
	  System.out.println("Enter number");
	 number= input.nextInt();
	 //initialize factorial variable
	 int factorial = 1;

	 //running loop for calculating factors using for loop
	for(int i=1;i<= number;i++){
		factorial *= i;
	}
	  System.out.println("The factorial of number "+number+"is "+factorial);
	  
   }
}