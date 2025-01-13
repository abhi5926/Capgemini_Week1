//Importing scanner class liberaries
import java.util.Scanner;
//creating class  Calculator to parform operation Addition, Subtraction, Multiplication and Division
class Calculator{
   public static void main(String args[]){
	   //Creating object of Scanner class
   Scanner input = new Scanner(System.in);
   //Creating variable name number1 and number2 of type float
    float number1,number2;
	//Taking input in both of the variables number1 and number2
	//Display message
	System.out.println("Enter first number");
	number1 = input.nextFloat();
	//Display message
	System.out.println("Enter second number");
	number2 = input.nextFloat();
	//Performing addition operation and store it in variable name addition of type float
	float addition = number1 + number2;
	
	//Performing subtraction operation and store it in variable name subtraction of type float
	float subtraction = number1 - number2;
	//Performing multiplication operation and store it in variable name multiplication of type float
	float multiplication = number1 * number2;
	//Performing division operation and store it in variable name division of type float
	float division = number1 /number2;
	//Display the output of code
	System.out.println("The addition, subtraction, multiplication and division value of 2 numbers"+number1+ "and "+number2+"is"+ addition +","+subtraction+","+multiplication+" and "+ division);

	
	
	
	
   }
}