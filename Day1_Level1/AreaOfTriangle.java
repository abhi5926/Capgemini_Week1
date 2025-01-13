//Importing scanner class liberaries
import java.util.Scanner;
//creating class  AreaOfTriangle to calculate triangle area
class AreaOfTriangle{
   public static void main(String args[]){
	   //Creating object of Scanner class
   Scanner input = new Scanner(System.in);
   //Creating variable name base and height of type float
    float base,height;
	//Taking input in both of the variables base and height
	//Display message
	System.out.println("Enter base of triangle");
	//Taking user input
	base = input.nextInt();
	//Display message
	System.out.println("Enter height of triangle");
	//Taking user input
	height = input.nextInt();
	
	double areaOfTriangle = (1.0/2) * base * height;
	
	double squareFeet = areaOfTriangle /(12 * 2.14);
	double squareInches = areaOfTriangle / 2.54;
	
	System.out.println("Your Height in cm is "+height+" while in feet is "+squareFeet+" and inches is "+squareInches);

	

   }
}