//Importing Scanner class liberaries
import java.util.Scanner;
// Creating class name CalculateSimpleInterest
public class CalculateSimpleInterest {
   //Creating method for simple interest
  public int simpleInterest(int principal ,int rate , int time){
    //Calculating simple interest
		 int simpleInterest =  (principal * rate * time) / 100;
		 return simpleInterest;
  }
  
  public static void main(String[] args) {
  
        // Creating a Scanner class object 
        Scanner input = new Scanner(System.in);
        
        // Declaring variables name   principle , rate , time 
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
		 //creating class object
		CalculateSimpleInterest ob = new CalculateSimpleInterest();
       // creating result variable to store simple interest
       int result = ob.simpleInterest(principal , rate , time);
        System.out.println("The Simple Interest is " +result+" for Principal "+principal+ ", Rate of Interest "+rate+" and Time "+time);
    }
}

