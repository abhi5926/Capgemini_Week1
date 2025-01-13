//Importing Scanner class liberaries
import java.util.Scanner;
// Creating class name HarshadNumber

public class HarshadNumber{
  public static void main(String[] args) {
  
       // Creating a Scanner class object 
       Scanner input = new Scanner(System.in);
        
      // Declaring variable number of type int
      int number ;
	  int originalNumber=number;
	  
      //Taking number as input 
	  System.out.println("Enter number");
	 number= input.nextInt();
	 //Declearing variable as sum initialize with 0
	int sum =0;
	 
	//calculating Harshad Number using while loop
	
	while(number != 0){
		int digit = number%10;
		sum += digit;
		number = number/10;
		
	}
	if(number % sum == 0){
  System.out.println("The  number"+originalNumber+ "is the Harshad Number ");
	}else{
		 System.out.println("The  number"+number+ "is Not the Harshad Number ");
	}
	
   }
}