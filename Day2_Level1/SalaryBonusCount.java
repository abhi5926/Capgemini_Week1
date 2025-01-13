//Importing Scanner class liberaries
import java.util.Scanner;
// Creating class name SalaryBonusCount

public class SalaryBonusCount{
  public static void main(String[] args) {
  
       // Creating a Scanner class object 
       Scanner input = new Scanner(System.in);
        
      // Declaring variable salary of type double
      double salary ;
	  // Declaring variable salary of type double
	   int serviceYear;
      //Taking salary as input 
	  System.out.println("Enter salary");
	 salary= input.nextDouble();
	 
	 //Taking service year as input 
	  System.out.println("Enter service year");
	 serviceYear= input.nextInt();
	

	 //using if else condition to estimate salary bonus
	
		if(serviceYear >5){
			double bonus = salary * 0.05;
			System.out.println("The bonus for the employee "+bonus);
		}else{
			System.out.println("No bonus for the employee ");
		}
	
	  
   }
}