//Importing scanner class liberaries
import java.util.Scanner;
//creating class  MaximumNumberOfHandShakes to calculate number of handshakes
class MaximumNumberOfHandShakes{
   public static void main(String args[]){
	 //Creating object of Scanner class
   Scanner input = new Scanner(System.in);
   //Creating variable name numberOfStudents type int
    int numberOfStudents;
	
	//Display message
	System.out.println("Enter the number of students ");
	//Taking user input
	numberOfStudents = input.nextInt();
	//Display message
	
	//Calculate the total price and store in the variable totalPrice
	int totalHandShake= (numberOfStudents * (numberOfStudents - 1)) / 2 ;
	//Display output
	System.out.println("The total number of handshakes is "+totalHandShake);
   }
}