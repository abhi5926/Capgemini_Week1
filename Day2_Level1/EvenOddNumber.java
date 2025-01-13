//Importing Scanner class liberaries
import java.util.Scanner;
// Creating class name EvenOddNumber

public class EvenOddNumber{
  public static void main(String[] args) {
  
       // Creating a Scanner class object 
       Scanner input = new Scanner(System.in);
        
      // Declaring variable number of type int
      int number ;
	   
      //Taking number as input 
	  System.out.println("Enter number");
	 number= input.nextInt();
	

	 //running loop for calculating Even or odd using for loop
	for(int i=1;i<= number;i++){
		if(i % 2 == 0){
			System.out.println(i +"this is the even number" );
		}else{
			System.out.println(i +"this is the odd number" );
		}
	}
	  
   }
}