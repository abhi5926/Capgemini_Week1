
//importing Scanner class liberaries
import java.util.Scanner;
//Creating class name IncomeOfParson for calculating parson income
class IncomeOfParson{
    
    public static void main(String args[]){
        
        // Creating a Scanner object 
        Scanner input = new Scanner(System.in);
    
        // Declearing integer variables name salary
        
		double  salary ;
        //Display message to the user to user input
       System.out.println("Enter the parson salary ");
	   //Taking input from user as salary
	   salary  = input.nextDouble();
	   
	   double  bonus ;
        //Display message to the user to user input
       System.out.println("Enter the bonus ");
	   //Taking input from user as salary
	   bonus  = input.nextDouble();
	   
	   //Calculating income by adding salary and bonus and store in the variable income
        double income = salary + bonus;
       //Display the income of parson
		System.out.println("The salary is INR "+salary+" and bonus is INR "+bonus+". Hence Total Income is INR "+income);
    }
}
