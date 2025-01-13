import java.util.Scanner;
public class UnitConverter{

    //Method to convert kilometers to miles
    public static double convertKmToMiles(double km) {
        double km2miles = 0.621371;  // Conversion factor
        return km * km2miles;
    }

    //Method to convert miles to kilometers
    public static double convertMilesToKm(double miles) {
        double miles2km = 1.60934;  // Conversion factor
        return miles * miles2km;
    }

    //Method to convert meters to feet
    public static double convertMetersToFeet(double meters) {
        double meters2feet = 3.28084; 
        return meters * meters2feet;
    }

    //Method to convert feet to meters
    public static double convertFeetToMeters(double feet) {
        double feet2meters = 0.3048;  
        return feet * feet2meters;
    }

    // Main method to test the converter
    public static void main(String[] args) {
        //Testing the conversion methods
        double km = 10.0;
        double miles = 6.2;
        double meters = 5.0;
        double feet = 16.4;
        //Convert kilometers to miles
        double kmToMiles = convertKmToMiles(km);
        System.out.println(km + " kilometers is equal to " + kmToMiles + " miles.");
        //Convert miles to kilometers
        double milesToKm = convertMilesToKm(miles);
        System.out.println(miles + " miles is equal to " + milesToKm + " kilometer ");
		//Convert meters to feet
        double metersToFeet = convertMetersToFeet(meters);
        System.out.println(meters + " meters is equal to " + metersToFeet + " feet.");
        //Convert feet to meters
        double feetToMeters = convertFeetToMeters(feet);
        System.out.println(feet + " feet is equal to " + feetToMeters + " meters.");
    }
}
