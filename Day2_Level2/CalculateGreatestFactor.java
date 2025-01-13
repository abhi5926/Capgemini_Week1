//Importing Scanner class liberaries
import java.util.Scanner;
// Creating class name CalculateGreatestFactor
public class CalculateGreatestFactor{
  public static void main(String[] args) {
  
       // Creating a Scanner class object 
       Scanner input = new Scanner(System.in);
        
      // Declaring variable number of type int
      int number,greatestFactor=1;
	   
      //Taking number as input 
	  System.out.println("Enter number");
	 number= input.nextInt();
	 
	 for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) {
                greatestFactor = i; 
                break; 
        }
	 }
	 
	  System.out.println("The greatest factor of " + number + " is " + greatestFactor);
   }
}