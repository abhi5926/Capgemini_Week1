//Importing scanner class liberaries
import java.util.Scanner;
//creating class  FindSideOfSquare to calculate side of triangle
class FindSideOfSquare{
   public static void main(String args[]){
	   //Creating object of Scanner class
   Scanner input = new Scanner(System.in);
   //Creating variable name perimeter of type int
    int perimeter;
	
	//Display message
	System.out.println("Enter peremeter of square");
	//Taking user input
	perimeter= input.nextInt();
	//Calculating side and store in side variable
	int side = perimeter / 4;
	//Display the output
	System.out.println("The length of the side is "+ side +" whose perimeter is "+ perimeter);
   }
}