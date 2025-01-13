//Importing Scanner class liberaries
import java.util.Scanner;
// Creating class name FactorialWhileloop

public class FactorialWhileloop{
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

	 //running loop for calculating factors using while loop
	int i=1;
	while(i <= number){
		factorial *= i;
		i++;
	}
	  System.out.println("The factorial of number "+number+"is "+factorial);
	  
   }
}