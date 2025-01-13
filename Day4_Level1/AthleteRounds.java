import java.util.Scanner;

public class AthleteRounds {

    //Method to calculate 
    public static void calculateRounds() {
        //Creating a Scanner object for user input
        Scanner input = new Scanner(System.in);

        //Taking input for the sides of the triangle
        System.out.println("Enter the first side of the triangle in meters");
        double side1 = input.nextDouble();
        
        System.out.println("Enter the second side of the triangle in meters");
        double side2 = input.nextDouble();
        
        System.out.println("Enter the third side of the triangle in meters");
        double side3 = input.nextDouble();
        
        //Calculating the perimeter
        double perimeter = side1 + side2 + side3;

        //Converting 5 km into meters
        double totalDistance = 5000;
        
        //Calculating the total number of rounds
        double rounds = totalDistance / perimeter;
        
        //Displaying the result
        System.out.println("The total number of rounds the athlete will run is " + rounds + " to complete 5 km.");

        //Closing the scanner
        input.close();
    }

    public static void main(String[] args) {
        // Calling the method to calculate rounds
        calculateRounds();
    }
}
