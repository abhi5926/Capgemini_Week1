
//importing Scanner class liberaries
import java.util.Scanner;
//Creating class name FarenheitToCelsius for converting temprature farenheit to celsius
class FarenheitToCelsius{
    
    public static void main(String args[]){
        
        // Creating a Scanner object 
        Scanner input = new Scanner(System.in);
    
        // Declearing integer variables name  celsius to store the numbers
        int  fahrenheit ;
        //Display message to the user to user input
       System.out.println("Enter the temprature in fahrenheit ");
	   //Taking input from user in celcious variable
	   fahrenheit  = input.nextInt();
	   
	   //converting temprature in fahrenheit  to celsius
        int celsiusResult  =   (fahrenheit - 32) * (5/9) ;
       //Display the temprature in farenheit to user
		System.out.println("The "+fahrenheit+" fahrenheit is "+celsiusResult+" celsius");
    }
}
