import java.util.Scanner;
import java.util.*;
//Creating class name MaxOfThree
class MaxOfThree {

  public static void display(int firstNumber, int secondNumber , int thirdNumber){
  if(firstNumber > secondNumber && firstNumber > thirdNumber){
  System.out.println("The first number "+firstNumber + " is max out of three");
  }else if(firstNumber < secondNumber && secondNumber > thirdNumber){
      System.out.println("The second number "+secondNumber + " is max out of three");
  }else{
   System.out.println("The third number "+thirdNumber + " is max out of three");
  }
  }
       public static void main(String args[]){
	   // creating the object of Scanner class
	    Scanner sc = new Scanner(System.in);
		
		//Taking the first number as input from user
		int firstNumber,secondNumber,thirdNumber;
		System.out.println("Please Enter the first number ");
		firstNumber = sc.nextInt();
		
		//Taking the second number as input from user
		System.out.println("Please Enter the second number ");
		secondNumber = sc.nextInt();
		
		//Taking the third number as input from user
		System.out.println("Please Enter the third number ");
		thirdNumber = sc.nextInt();
		
		display(firstNumber,secondNumber,thirdNumber);
	   }
}