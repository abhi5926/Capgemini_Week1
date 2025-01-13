//Importing Scanner class liberaries
import java.util.Scanner;
// Creating class name CheckLargestOutOfThree
public class CheckLargestOutOfThree{
  public static void main(String[] args) {
  
        // Creating a Scanner class object 
        Scanner input = new Scanner(System.in);
        
        // Declaring variables name number 
        int  number1, number2, number3;
        
        // Taking number first as input from user  
        System.out.println("Enter the first number");
		number1 =input.nextInt();
		
		// Taking number second as input from user  
        System.out.println("Enter the second number");
		number2 =input.nextInt();
		
		// Taking number third as input from user  
        System.out.println("Enter the third number");
		number3 =input.nextInt();
		
		if(number1 > number2 && number1 > number3){
			 //Display message as output
			  System.out.println("Is the first number the largest? Yes");
			  System.out.println("Is the Second number the largest? No");
			  System.out.println("Is the third  number the largest? No");
		 }
         else if(number1 < number2 && number2 > number3){
			 //Display message as output
			  System.out.println("Is the first number the largest? No");
			  System.out.println("Is the Second number the largest? Yes");
			  System.out.println("Is the third  number the largest? No");
		 }
		  else if(number1 == number2 && number2 == number3){
			 //Display message as output
			  System.out.println("All are equal");
			  
		 }
		 else {
			 //Display message as output
			 System.out.println("Is the first number the largest? No");
			  System.out.println("Is the third  number the largest? Yes");
			  System.out.println("Is the third  number the largest? No");
		 }
    }
}
