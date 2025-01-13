//Importing Scanner class liberaries
import java.util.Scanner;
// Creating class name ArmstrongNumber

public class ArmstrongNumber{
  public static void main(String[] args) {
  
       // Creating a Scanner class object 
       Scanner input = new Scanner(System.in);
        
      // Declaring variable number of type int
      int number ;
	  
      //Taking number as input 
	  System.out.println("Enter number");
	 number= input.nextInt();
	 
	int originalNumber= number;
	int sum=0;
	
	while(number != 0){
		int digit= number %10;
		sum += digit *digit * digit;
		number = number/10;
	}
  if(originalNumber == sum){
	  System.out.println("The number is Aramstrong number");
  }
  else{
	  System.out.println("The number is Not Aramstrong number");
  }
	
   }
}