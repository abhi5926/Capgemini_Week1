//Importing Scanner class liberaries
import java.util.Scanner;
// Creating class name CheckSpringSeason
public class CheckSpringSeason{
  public static void main(String[] args) {
  
        // Creating a Scanner class object 
        Scanner input = new Scanner(System.in);
        
        // Declaring variables name month and day
        int  month, day;
        
        // Taking month as input from user  
        System.out.println("Enter the month");
		month =input.nextInt();
		
		 // Taking day as input from user  
        System.out.println("Enter the day");
		day =input.nextInt();
		if(month == 3 && day >= 20 || month == 4 || month == 5 || (month == 6 && day <= 20)){
			 //Display message as output
			  System.out.println("Its a Spring Season");
			 
		 }
		 else {
			 //Display message as output
			 System.out.println("Not a Spring Season");
			  
		 }
    }
}
