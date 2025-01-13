//Importing Scanner class liberaries
import java.util.Scanner;
// Creating class name CalculatePower

public class CalculatePower{
  public static void main(String[] args) {
  
       // Creating a Scanner class object 
       Scanner input = new Scanner(System.in);
        
      // Declaring variable number of type int
      int number ,power;
	   
      //Taking number as input 
	  System.out.println("Enter number");
	 number= input.nextInt();
	 
	 //Taking power as input 
	  System.out.println("Enter power");
	 power= input.nextInt();
//initialize result variable with 1
	int result =1;
	for(int i=1;i<= power;i++){
	result = result * number;
	}
	 
	  System.out.println("The power of the number "+number+" is "+ result);
   }
}