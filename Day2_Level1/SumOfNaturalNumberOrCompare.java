//Importing Scanner class liberaries
import java.util.Scanner;
// Creating class name SumOfNaturalNumberOrCompare
public class SumOfNaturalNumberOrCompare{
  public static void main(String[] args) {
  
        // Creating a Scanner class object 
        Scanner input = new Scanner(System.in);
        
        // Declaring variables name number 
      int number;
        
        // Taking number as input from user  
        System.out.println("Enter the number");
		number =input.nextInt();
		//Declearing formulaSum variable
		int formulaSum=0, loopSum=0;
		if(number > 0){
		//calculating sum from formula
		formulaSum = (number * (number + 1)) / 2;
		for(int i = 1;i <= number;i++){
			loopSum += i;
		}
		}
		if(formulaSum == loopSum){
			 System.out.println("Correct");
		}else{
			System.out.println("Not Correct");
		}
   }
}