//Importing Scanner class liberaries
import java.util.Scanner;
// Creating class name ConvertWeightInPound 
public class weightInKilograms {
  public static void main(String[] args) {
  
        // Creating a Scanner class object 
        Scanner input = new Scanner(System.in);
        
        // Declaring variables name   numberOfchocolates and numberOfChildre
        double weight;
        
        // Taking weight as input from user in pound 
        System.out.println("Enter the weight in pound");
        weight = input.nextInt();
		//Creating variable name weightInKilograms to store weight in kilogram
		
		double weightInKilograms = weight * 2.2;
		
        // Displaying the result
        System.out.println(" The weight of the person in pound is "+weight+" and in kg is "+weightInKilograms);
    }
}
