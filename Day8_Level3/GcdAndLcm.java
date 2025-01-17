import java.util.Scanner;
import java.util.*;

class GcdAndLcm {
 
    public static int gcdCalculate(int number1,int number2){
	    
		if(number2 == 0){
		return number1;
		}
		return gcdCalculate(number2,number1%number2);
	}
	public static int lcmCalculate(int number1,int number2){
	    
		int first = (number1 * number2);
		int lcm = first / gcdCalculate(number1,number2);
		return lcm;
		
	}
	
     public static void main(String args[]){
	  // Creating object of Scanner Class
	  Scanner sc = new Scanner(System.in);
	  // Taking two number as input from user
	  int number1,number2;
	  
	  //Taking first number as input
	  System.out.println("Enter first number");
	  number1 =sc.nextInt();
	  
	  //Taking second number as input
	  System.out.println("Enter second number");
	  number2 =sc.nextInt();
	  
	  // storing result from methods in variable
	  int gcd = gcdCalculate(number1,number2);
	  int lcm = lcmCalculate(number1,number2);
	  
	  // Display the result
	  System.out.println("GCD of the number "+ number1 +" and "+number2 +" is "+ gcd);
	  System.out.println("LCM of the number "+ number1 +" and "+number2 +" is "+ lcm);
	 }
} 