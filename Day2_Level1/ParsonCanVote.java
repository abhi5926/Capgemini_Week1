//Importing Scanner class liberaries
import java.util.Scanner;
// Creating class name ParsonCanVote
public class ParsonCanVote{
  public static void main(String[] args) {
  
        // Creating a Scanner class object 
        Scanner input = new Scanner(System.in);
        
        // Declaring variables name age
        int  age;
        
        // Taking age  as input from user  
        System.out.println("Enter the age");
		age =input.nextInt();
		
		
		if(age >= 18){
			 //Display message as output
			 
			  System.out.println("The person's age is "+age+" and can vote.");
			  
		 }
		 else {
			 //Display message as output
			 System.out.println("The person's age is "+age+" and cannot vote.");
			  
		 }
    }
}
