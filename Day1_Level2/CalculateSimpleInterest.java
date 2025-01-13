//Importing Scanner class liberaries
import java.util.Scanner;
// Creating class name CalculateSimpleInterest
public class CalculateSimpleInterest {
  public static void main(String[] args) {
  
        // Creating a Scanner class object 
        Scanner input = new Scanner(System.in);
        
        // Declaring variables name   numberOfchocolates and numberOfChildre
        int principal, rate, time;
        
        // Taking principal as input from user
        System.out.println("Enter the principal amount");
        principal = input.nextInt();
		
		// Taking rate as input from user
        System.out.println("Enter the rate in parcent");
         rate = input.nextInt();
       
	   // Taking time as input from user
        System.out.println("Enter the time");
         time = input.nextInt();
		 //Calculating simple interest
		 int simpleInterest =  (principal * rate * time) / 100;

        // Displaying the result
        System.out.println("The Simple Interest is " +simpleInterest+" for Principal "+principal+ ", Rate of Interest "+rate+" and Time "+time);
    }
}
