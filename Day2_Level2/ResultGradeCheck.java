//Importing Scanner class liberaries
import java.util.Scanner;
// Creating class name ResultGradeCheck
public class ResultGradeCheck{
  public static void main(String[] args) {
  
        // Creating a Scanner class object 
        Scanner input = new Scanner(System.in);
        
        // Declaring variables name year of type int
      int marksPhysics, marksChemistry, marksMaths;
        
      //Taking Physics marks as input
	  System.out.println("Enter physics marks");
	  marksPhysics = input.nextInt();
	  
	  //Taking chemistry marks as input
	  System.out.println("Enter chemistry marks");
	  marksChemistry = input.nextInt();
	  
	  //Taking Physics marks as input
	  System.out.println("Enter maths marks");
	  marksMaths = input.nextInt();
	  //calculating parcentage and storing in variable parcentage
	 int parcentage = (marksPhysics + marksChemistry + marksMaths)/ 3;
	if(parcentage > 80){
		System.out.println("A");
	}else if(parcentage >= 70 && parcentage <= 79){
		System.out.println("B");
	}else if(parcentage >= 60 && parcentage <= 69){
		System.out.println("C");
	}else if(parcentage >= 50 && parcentage <= 59){
		System.out.println("D");
	}else if(parcentage >= 40 && parcentage <= 49){
		System.out.println("E");
	}else {
		System.out.println("R");
	}
	
   }
}