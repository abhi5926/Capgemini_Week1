//Importing Scanner class liberaries
import java.util.Scanner;
// Creating class name WhileLoopCountdown
public class WhileLoopCountdown{
  public static void main(String[] args) {
  
        // Creating a Scanner class object 
        Scanner input = new Scanner(System.in);
        
        // Declaring variables name value 
        int  value;
        
        // Taking value as input from user  
        System.out.println("Enter the value");
		value =input.nextInt();
		
		 while(value != 0){
		 //Display the Countdown value
		 System.out.println(value);
		 value--;
}		 
    }
}
