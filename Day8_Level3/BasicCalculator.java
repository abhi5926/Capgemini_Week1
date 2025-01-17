import java.util.Scanner;
import java.util.*;

class BasicCalculator { 

   //Addition Method
   public static int add(int fnumber, int snumber){
      int result = fnumber + snumber;
	  return result;
   }
   //Subtract Method
   public static int sub(int fnumber, int snumber){
      int result = fnumber - snumber;
	  return result;
   }
   
   //Multiplication  Method
   public static int mult(int fnumber, int snumber){
      int result = fnumber * snumber;
	  return result;
   }
   
   //Division  Method
   public static int div(int fnumber, int snumber){
      int result = fnumber / snumber;
	  return result;
   }
      public static void main(String args[]){
	      // Creating object of Scanner class to take user input
		  Scanner sc = new Scanner(System.in);
		  System.out.println("------------- Welcome To Calculator -------------");
		  //Taking input as firstNumber
		  int firstNumber;
		  System.out.println("Enter the first number");
		  firstNumber = sc.nextInt();
		  
		  //Taking input as secondNumber
		  int secondNumber;
		  System.out.println("Enter the second number");
		  secondNumber = sc.nextInt();
		  
		  
		  System.out.println("1. Addition ");
		  System.out.println("2. Subtraction ");
		  System.out.println("3. Multiplication ");
		  System.out.println("4. division ");
		  System.out.println("5. Exit ");
		  
		  
		  //Taking choice as input from user
		  int choice;
		  System.out.println("Please Enter your choice :");
		  choice =sc.nextInt();
		  
		 
		  //using switch case to perform function in calculator
		  switch(choice){
		  case 1: {
		   System.out.println("Addition of number is =" + add(firstNumber , secondNumber));
		   break;
		  }
		  
		  case 2: {
		   System.out.println("Subtraction of number is =" + sub(firstNumber , secondNumber));
		   break;
		  }
		  
		   case 3: {
		   System.out.println("Multiplication  of number is =" + mult(firstNumber , secondNumber));
		   break;
		  }
		  case 4: {
		   System.out.println("Division  of number is =" + div(firstNumber , secondNumber));
		   break;
		  }
		  
		  default:
		  {
		  System.out.println("Plese Enter the valid choice :");
		  break;
		  }
	  }
		  }
		  
	  
}
