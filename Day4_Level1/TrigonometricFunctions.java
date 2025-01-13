import java.util.Scanner;

public class TrigonometricFunctions{

    // Method to calculate various trigonometric functions
    public static double[] calculateTrigonometricFunctions(double angle) {
        // Converting the angle from degrees to radians
        double radians = Math.toRadians(angle);

        // Calculating sine, cosine, and tangent
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);

        // Returning the results as an array
        return new double[]{sine, cosine, tangent};
    }

    public static void main(String[] args) {
        // Creating a Scanner object for input
        Scanner input = new Scanner(System.in);

        // Taking angle input from the user
        System.out.println("Enter the angle in degrees");
        double angle = input.nextDouble();

        // Calling the method 
        double[] results = calculateTrigonometricFunctions(angle);

        // Displaying the results
        System.out.println("Sine of " + angle + " degrees is " + results[0]);
        System.out.println("Cosine of " + angle + " degrees is " + results[1]);
        System.out.println("Tangent of " + angle + " degrees is " + results[2]);

        // Closing the scanner
        input.close();
    }
}
