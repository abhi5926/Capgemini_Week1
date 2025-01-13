import java.util.Scanner;

public class WindChillCalculator{

    // Method to calculate the wind chill temperature
    public static double calculateWindChill(double temperature, double windSpeed) {
        //using formula 
        double windChill = 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
        return windChill;
    }

    public static void main(String[] args) {
        // Creating a Scanner class object for input
        Scanner input = new Scanner(System.in);

        // Taking temperature and wind speed as input from the user
        System.out.println("Enter the temperature in Fahrenheit:");
        double temperature = input.nextDouble();

        System.out.println("Enter the wind speed in miles per hour:");
        double windSpeed = input.nextDouble();

        // Calling the method to calculate the wind chill
        double windChill = calculateWindChill(temperature, windSpeed);

        // Displaying the result
        System.out.println("The wind chill temperature is " + windChill);

        // Closing the scanner
        input.close();
    }
}
