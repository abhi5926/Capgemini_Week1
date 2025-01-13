//Importing Scanner class liberaries
import java.util.Scanner;
// Creating class name FizzBuzzProbelemWhileLoop
public class FizzBuzzProbelemWhileLoop{
  public static void main(String[] args) {
  
       // Creating a Scanner class object 
       Scanner input = new Scanner(System.in);
        
      // Declaring variables name number of type int
      int number;
        
      //Taking number as input
	  System.out.println("Enter number");
	  number = input.nextInt();
	  //It is a variable of type int 
	  int i=1;
	   //Check if the number is positive
	   if(number <= 0){
	   System.out.println("please enter positive integer");
	   }else{
	   while(i <= number){
	   //Checking number is divisible by both 3 and 5
	    if(i % 3 == 0 && i % 5 == 0){
		System.out.println("FizzBuzz");
		}
		//Checking number is divisible by 3 
		else if(i % 3 == 0 ){
		System.out.println("Fizz");
		}
		//Checking number is divisible by 5
		else if(i % 5 == 0 ){
		System.out.println("Buzz");
		}
		//Otherwise print the number
		else{
		System.out.println(i);
		}
		i++;
	  }
	  }
   }
}