import java.util.Scanner;
public class UnitConverterAnother{

    // Method to convert yards to feet
    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3;  
        return yards * yards2feet;
    }

    // Method convert feet to yards
    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333;  
        return feet * feet2yards;
    }

    // Method convert meters to inches
    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701;  
        return meters * meters2inches;
    }

    // Method to convert inches to meters
    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254;  
        return inches * inches2meters;
    }

    // Method to convert inches to centimeters
    public static double convertInchesToCentimeters(double inches) {
        double inches2cm = 2.54; 
        return inches * inches2cm;
    }

    // Main method to test the converter
    public static void main(String[] args) {
        //creating the object and assign values
        double yards = 10.0;
        double feet = 30.0;
        double meters = 5.0;
        double inches = 50.0;

        //Convert yards to feet
        double yardsToFeet = convertYardsToFeet(yards);
        System.out.println(yards + " yards is equal to " + yardsToFeet + " feet.");

        //Convert feet to yards
        double feetToYards = convertFeetToYards(feet);
        System.out.println(feet + " feet is equal to " + feetToYards + " yards.");

        //Convert meters to inches
        double metersToInches = convertMetersToInches(meters);
        System.out.println(meters + " meters is equal to " + metersToInches + " inches.");
        //Convert inches to meters
        double inchesToMeters = convertInchesToMeters(inches);
        System.out.println(inches + " inches is equal to " + inchesToMeters + " meters.");
        //Convert inches to centimeters
        double inchesToCentimeters = convertInchesToCentimeters(inches);
        System.out.println(inches + " inches is equal to " + inchesToCentimeters + " centimeters.");
    }
}
