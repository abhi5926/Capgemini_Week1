//Importing Scanner class liberaries
import java.util.Scanner;
// Creating class name CountDigit

public class CountDigit{
  public static void main(String[] args) {
  
       // Creating a Scanner class object 
       Scanner input = new Scanner(System.in);
        
      // Declaring variable number of type int
      int number ;
	  
      //Taking number as input 
	  System.out.println("Enter number");
	 number= input.nextInt();
	 //Declearing variable as count
	int count =0;
	//calculating count using while loop
	
	while(number != 0){
		number = number/10;
		count++;
	}
  System.out.println("The count of number is "+count);
	
   }
}