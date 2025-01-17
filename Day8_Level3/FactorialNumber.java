import java.util.Scanner;
import java.util.*;

class FactorialNumber {
  // using recursive method to calculate factorial of the number
  public static int func(int number){
      if(number == 1){
	  return 1;
	  }
	  int partial_ans = func(number-1) * number;
	  return partial_ans;
  }
  // Main method
    public static void main(String args[]){
	  
	   //Creating the object of Scanner class
	   Scanner sc = new Scanner(System.in);
	   
	   //creating a variable of type int to take the number as input
	   int number;
	   System.out.println("Please enter the number");
	   number = sc.nextInt();
	   
	   //Receiving result from factorial method
	   int factNumber = func(number);
	   // Display the output
	   System.out.println("Factorial number of number "+ number + " is "+factNumber);
	}
}