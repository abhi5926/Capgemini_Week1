
public class CalculateUnitConverter{

    //convert Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        double fahrenheit2celsius = (fahrenheit - 32) * 5 / 9;  
        return fahrenheit2celsius;
    }

    //convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        double celsius2fahrenheit = (celsius * 9 / 5) + 32; 
        return celsius2fahrenheit;
    }

    //convert pounds to kilograms
    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;  // Conversion factor
        return pounds * pounds2kilograms;
    }

    //convert kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462;  // Conversion factor
        return kilograms * kilograms2pounds;
    }

    //convert gallons to liters
    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }

    //convert liters to gallons
    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;  // Conversion factor
        return liters * liters2gallons;
    }

    
    public static void main(String[] args) {
        //creating variables and assign the values
        double fahrenheit = 98.6;
        double celsius = 37.0;
        double pounds = 150.0;
        double kilograms = 68.18;
        double gallons = 10.0;
        double liters = 37.85;

        //
        double fahrenheitToCelsius = convertFahrenheitToCelsius(fahrenheit);
        System.out.println(fahrenheit + " Fahrenheit is equal to " + fahrenheitToCelsius + " Celsius.");

        // Convert Celsius to Fahrenheit
        double celsiusToFahrenheit = convertCelsiusToFahrenheit(celsius);
        System.out.println(celsius + " Celsius is equal to " + celsiusToFahrenheit + " Fahrenheit.");

        //Convert pounds to kilograms
        double poundsToKilograms = convertPoundsToKilograms(pounds);
        System.out.println(" pounds to kilogram is " + poundsToKilograms);

        // Convert kilograms to pounds
        double kilogramsToPounds = convertKilogramsToPounds(kilograms);
        System.out.println( " kilograms to pounds" + kilogramsToPounds);

        // Convert gallons to liters
        double gallonsToLiters = convertGallonsToLiters(gallons);
        System.out.println(" gallons to liter is " + gallonsToLiters );
        // Convert liters to gallons
        double litersToGallons = convertLitersToGallons(liters);
        System.out.println("liters to gallons "+ litersToGallons);
    }
}
