//Importing the liberaries of Scanner class
import java.util.Scanner;
//Creating a class name DistanceInKilometerConversion to convert distance in kilometer
class DistanceInKilometerConversion{
public static void main(String args[]){
   //creating variable name km
   double km;
   //Creating the object of Scanner class
   Scanner input=new Scanner(System.in);
   //Taking user input in variable km
   km=input.nextInt();
   // Calculating the distance in kilometer and storing tha value in a variable name distanceInKilometer of type double
    double distanceInKilometer = km * 1.6;
	//Display distance in kilometer
	System.out.println("The distance in kilometer is "+ km +"and the distance in miles is "+distanceInKilometer);
   
   
}
}