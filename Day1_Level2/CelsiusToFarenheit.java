// Importing Scanner class for input
//importing Scanner class liberaries
import java.util.Scanner;
//Creating class name CelsiusToFarenheit for converting temprature celsius to farenheit
class CelsiusToFarenheit{
    
    public static void main(String args[]){
        
        // Creating a Scanner object 
        Scanner input = new Scanner(System.in);
    
        // Declearing integer variables name  celsius to store the numbers
        int  celsius;
        //Display message to the user to user input
       System.out.println("Enter the temprature in celcious");
	   //Taking input from user in celcious variable
	   celsius = input.nextInt();
	   
	   //converting temprature in celsius to farenheit
        int farenheitResult =   (celsius * (9/5)) + 32;
       //Display the temprature in farenheit to user
		System.out.println("The " +celsius+" celsius is " +farenheitResult+" fahrenheit");
        
    }
}
