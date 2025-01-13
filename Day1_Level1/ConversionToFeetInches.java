//Importing scanner class liberaries
import java.util.Scanner;
//creating class to convert centimeter to feet and inches
class ConversionToFeetInches{
   public static void main(String args[]){
	   //creating object of scanner class
   Scanner input = new Scanner(System.in);
   //creating variable name height
    int height;
	//taking user input in height variable in centimeter 
	height = input.nextInt();
	//Converting centimeter into feet
	double ConvertIntoFeet = height / (12 *2.54);
	//Converting centimeter into inches
	double ConvertIntoInches = height / 2.54;
	//Display centimeter, feet, inches
	System.out.println("Your Height in cm is "+ height +" while in feet is "+ ConvertIntoFeet +" and inches is "+ConvertIntoInches);
   }
}