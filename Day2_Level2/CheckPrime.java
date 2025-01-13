//Importing Scanner class liberaries
import java.util.Scanner;
// Creating class name CheckPrime
public class CheckPrime{
  public static void main(String[] args) {
  
       // Creating a Scanner class object 
       Scanner input = new Scanner(System.in);
        
      // Declaring variables name number of type int
      int number;
        
      //Taking number as input
	  System.out.println("Enter number");
	  number = input.nextInt();
	   
	  // Declaring variables name isPrime of type boolean
	  boolean isPrime = true;
	  
	  if(number <= 1){
		  isPrime= false;
	  }else{
		  for (int i = 2; i <= Math.sqrt(number); i++) {
               
                if (number % i == 0) {
                    isPrime = false;
                    break; 
                }
	  }
	  }
	  if(isPrime == true){
		  System.out.println(number +"is a prime number");
	  }else{
		  System.out.println(number +"is not prime number");
	  }
   }
}