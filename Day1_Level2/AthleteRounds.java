//Importing Scanner class liberaries
import java.util.Scanner;
// Creating class name AthleteRouns
public class AthleteRounds {
  public static void main(String[] args) {
        // Creating a Scanner class object 
        Scanner input = new Scanner(System.in);
        
        // Declaring variables for the sides 
        double side1, side2, side3;
        
        // Taking side1 as input from user
        System.out.println("Enter the first side of the triangle in meters");
        side1 = input.nextDouble();
        
        System.out.println("Enter the second side of the triangle in meters");
        side2 = input.nextDouble();
        
        System.out.println("Enter the third side of the triangle in meters");
        side3 = input.nextDouble();
        
        // Calculating the perimeter of the triangle
        double perimeter = side1 + side2 + side3;
        
        // Converting km into meter and storing in the variable name totalDistance
        double totalDistance = 5000;
		
        // Calculating the number of rounds 
        double rounds = totalDistance / perimeter;
        
        // Displaying the result
        System.out.println(" The total number of rounds the athlete will run is "+rounds+"to complete 5 km");
    }
}
