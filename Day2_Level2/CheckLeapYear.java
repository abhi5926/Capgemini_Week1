//Importing Scanner class liberaries
import java.util.Scanner;
// Creating class name CheckLeapYear
public class CheckLeapYear{
  public static void main(String[] args) {
  
        // Creating a Scanner class object 
        Scanner input = new Scanner(System.in);
        
        // Declaring variables name year of type int
      int year;
        
        // Taking  year as input from user  
        System.out.println("Enter the year");
		year =input.nextInt();
		//Using ifelse statement to identify year is leap year or not 
		
		if(year >= 1582){
		
		  if(year % 4 ==0){
		  System.out.println("Year is leap year");
		  }else{
		  System.out.println("Year is not leap year");
		  }
		
		}else{
		System.out.println("Year is not leap year");
		}
		
   }
}