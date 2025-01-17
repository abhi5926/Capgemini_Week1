import java.util.Scanner;
import java.util.*;

//Creating the class to convert temprature  Fehrenheit to celsius
class CelsiusToFehrenheit {

    // Creating Method to convert temprature Fehrenheit to celsius
	public static double conversion(double temprature){
	   double temp = temprature - 32;
	   double temp1 = 5/9.0;
	   double celsius = temp * temp1;
	   return celsius;
	}
     public static void main(String args[]){
	      //Creating object of Scanner class
	      Scanner sc = new Scanner(System.in);
		  
		  //Taking temprature in fehrenheit as input
		  double temprature;
		  System.out.println("Enter the temprature in Fehrenheit");
		  temprature = sc.nextInt();
		  
		  double temp=conversion(temprature);
		  // Display the temprature
		  System.out.println("Temprature in Fehrenheit "+temprature + " is converted in celsius is " + temp);
		  
	 }
}