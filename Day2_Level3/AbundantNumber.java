//Importing Scanner class liberaries
import java.util.Scanner;
// Creating class name AbundantNumber

public class AbundantNumber{
  public static void main(String[] args) {
  
       // Creating a Scanner class object 
       Scanner input = new Scanner(System.in);
        
      // Declaring variable number of type int
      int number ;
	  
	  
      //Taking number as input 
	  System.out.println("Enter number");
	 number= input.nextInt();
	 //Declearing variable as sum initialize with 0
	int sum =0;
	 
	//calculating Abundant Number using for loop
	
	for(int i=1;i<=number;i++){
		if(number % i ==0){
			sum += i;
		}
	}
		if(sum > number){
			System.out.println("The number "+number+" is abundant number");
		}else{
			System.out.println("The number "+number+" is not abundant number");
		}
	
   }
}