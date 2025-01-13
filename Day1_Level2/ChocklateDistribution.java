//Importing Scanner class liberaries
import java.util.Scanner;
// Creating class name ChocklateDistribution
public class ChocklateDistribution {
  public static void main(String[] args) {
  
        // Creating a Scanner class object 
        Scanner input = new Scanner(System.in);
        
        // Declaring variables name   numberOfchocolates and numberOfChildre
        int numberOfchocolates, numberOfChildren;
        
        // Taking numberOfchocolates as input from user
        System.out.println("Enter the first number of chocolates");
        numberOfchocolates = input.nextInt();
        
        System.out.println("Enter the number of Children");
        numberOfChildren= input.nextInt();
        //Calculating how much chocklate childeren get
        int childrenGetChocklate = numberOfchocolates / numberOfChildren;
        // Remaining chocklates calculate
		int remainingChocklate = numberOfchocolates % numberOfChildren;
        // Displaying the result
        System.out.println("The number of chocolates each child gets is "+childrenGetChocklate+" and the number of remaining chocolates are "+ remainingChocklate);
    }
}
