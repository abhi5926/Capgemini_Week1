//Importing Scanner class liberaries
import java.util.Scanner;
// Creating class name CalculatingHandshakes
class CalculatingHandshakes{
   //Creating method for calculating handshakes
  public int handShakes(int number){
    //Calculating handshakes
		 int totalHandShake= (number * (number - 1)) / 2 ;
		 return totalHandShake;
  }
  
  public static void main(String[] args) {
  
    //Creating object of Scanner class
   Scanner input = new Scanner(System.in);
   // creating object of the class
   CalculatingHandshakes ob = new CalculatingHandshakes();
   //Creating variable name numberOfStudents type int
    int numberOfStudents;
	
	//Display message
	System.out.println("Enter the number of students ");
	//Taking user input
	numberOfStudents = input.nextInt();
	// creating result variable to receive result from method
	int result = ob.handShakes(numberOfStudents);
	//display the result
	System.out.println("The total number of handshakes is "+result);
    }
}

