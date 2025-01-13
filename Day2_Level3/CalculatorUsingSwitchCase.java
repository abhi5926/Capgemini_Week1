//Importing Scanner class liberaries
import java.util.Scanner;
// Creating class name CalculatorUsingSwitchCase

public class CalculatorUsingSwitchCase{
  public static void main(String[] args) {
  
       // Creating a Scanner class object 
       Scanner input = new Scanner(System.in);
        
      // Declaring variable number1 and number2 of type int
      int number1, number2 ;
	  
	  
      //Taking number1 as input 
	  System.out.println("Enter first number");
	 number1= input.nextInt();
	 
	//Taking number2 as input 
	  System.out.println("Enter second number");
	 number2= input.nextInt();
	 
	//Taking choice as input 
	String ch;
	System.out.println("Enter your choice: + Addition"+"\n"+"- Subtraction"+"\n"+"* Multiplication"+"\n"+"/ Division");
	ch= input.next();
	//using switch case
	switch(ch)
	{
		case "+":
		int result=number1 +number2;
		System.out.println("Addition ="+result);
		break;
		
		
		case "-":
		int result=number1 -number2;
		System.out.println("Subtraction ="+result);
		break;
		
		
		case "*":
		int result=number1 *number2;
		System.out.println("Multiplication ="+result);
		break;
		
		
		case "/":
		int result=number1 /number2;
		System.out.println("Division ="+result);
		break;
		
		default:
			System.out.println("Please enter valid values ");
		
	}
	
	
   }
}