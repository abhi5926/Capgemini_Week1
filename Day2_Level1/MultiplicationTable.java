//Importing Scanner class liberaries
import java.util.Scanner;
// Creating class name MultiplicationTable

public class MultiplicationTable{
  public static void main(String[] args) {
  
       // Creating a Scanner class object 
       Scanner input = new Scanner(System.in);
        
      // Declaring variable number of type int
      int number ;
	  
      //Taking number as input 
	  System.out.println("Enter number");
	 number= input.nextInt();
	 
	

	 //using for loop for 6 to 9 multiplication table
	  for (int i = 6; i <= 9; i++) {
           
            System.out.println(number + " * " + i + " = " + (number * i));
	  }
   }
}