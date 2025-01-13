//Importing Scanner class liberaries
import java.util.Scanner;
// Creating class name CalculateFactor

public class CalculateFactor{
  public static void main(String[] args) {
  
       // Creating a Scanner class object 
       Scanner input = new Scanner(System.in);
        
      // Declaring variable number of type int
      int number ;
	   
      //Taking number as input 
	  System.out.println("Enter number");
	 number= input.nextInt();
	 
	 //running loop for finding factors
	for(int i=1;i<= number;i++){
	if(number % i == 0){
	 System.out.println(i);
	}
	}
	 
	  
   }
}