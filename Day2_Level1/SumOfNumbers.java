//Importing Scanner class liberaries
import java.util.Scanner;
// Creating class name SumOfNumbers
public class SumOfNumbers{
  public static void main(String[] args) {
  
        // Creating a Scanner class object 
        Scanner input = new Scanner(System.in);
        
        // Declaring variables name value 
      double total = 0.0,value;
        
        // Taking value as input from user  
        System.out.println("Enter the value");
		value =input.nextInt();
		
		 while(true){
			
         // Taking value as input from user  
        System.out.println("Enter the value");
		value =input.nextInt();
		 
		 if(value == 0){
			 break;
		 }
		 total = total + value;
		 }
		 //Display output
		 System.out.println("total value="+total);
    }
}
