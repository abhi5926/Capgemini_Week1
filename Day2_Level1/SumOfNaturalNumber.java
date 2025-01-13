//Importing Scanner class liberaries
import java.util.Scanner;
// Creating class name SumOfNaturalNumber
public class SumOfNaturalNumber{
  public static void main(String[] args) {
  
        // Creating a Scanner class object 
        Scanner input = new Scanner(System.in);
        
        // Declaring variables name number 
        int  number;
        
        // Taking number  as input from user  
        System.out.println("Enter the number");
		number =input.nextInt();
		
		
		if(number > 0){
			 //Display message as output
			 int sum=(number * (number + 1)) / 2;
			  System.out.println("The sum of "+number+" natural numbers is "+ sum);
			  
		 }
         
		 else {
			 //Display message as output
			 System.out.println("The number "+number+ " is not a natural number");
			  
		 }
    }
}
