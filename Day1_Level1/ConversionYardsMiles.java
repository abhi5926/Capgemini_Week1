//Importing scanner class liberaries
import java.util.Scanner;
//creating class  ConversionYardsMiles to calculate yards and miles
class ConversionYardsMiles{
   public static void main(String args[]){
	   //Creating object of Scanner class
   Scanner input = new Scanner(System.in);
   //Creating variable name perimeter of type int
    int distanceFeet;
	
	//Display message
	System.out.println("Enter the distance in feet ");
	//Taking user input
	distanceFeet= input.nextInt();
	//Calculating distance in yards
	int distanceInYards = distanceFeet / 3;
	//Calculating distance in miles
	int distanceInMiles = distanceFeet / 1760;
	//Display the output
	System.out.println("The distance in yards is "+ distanceInYards +" and the distance in miles "+ distanceInMiles);
	

   }
}