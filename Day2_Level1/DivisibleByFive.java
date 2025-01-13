//Importing Scanner class liberaries
import java.util.Scanner;
// Creating class name DivisibleByFive 
public class DivisibleByFive{
  public static void main(String[] args) {
  
        // Creating a Scanner class object 
        Scanner input = new Scanner(System.in);
        
        // Declaring variables name number 
        int  number;
        
        // Taking number as input from user  
        System.out.println("Enter the number");
		number =input.nextInt();
         if(number % 5 == 0){
			 //Display message as output
			  System.out.println(" Is the number " +number+" divisible by 5? Yes");
		 }else{
			 //Display message as output
			  System.out.println(" Is the number " +number+" divisible by 5? No");
		 }
    }
}
