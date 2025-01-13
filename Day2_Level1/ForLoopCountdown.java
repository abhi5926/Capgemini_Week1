//Importing Scanner class liberaries
import java.util.Scanner;
// Creating class name ForLoopCountdown
public class ForLoopCountdown{
  public static void main(String[] args) {
  
        // Creating a Scanner class object 
        Scanner input = new Scanner(System.in);
        
        // Declaring variables name value 
        int  value;
        
        // Taking value as input from user  
        System.out.println("Enter the value");
		value =input.nextInt();
		
		 //Write down conditions in for loop
		 for(int i=value;i>=0;i--){
		 //Display the Countdown value
		 System.out.println(i);
		 }
    }
}
