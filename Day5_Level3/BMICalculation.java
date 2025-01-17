import java.util.Scanner;

class BMICalculation {

    // Method to calculate BMI and status
    public static String[] calculateBMIAndStatus(double weight, double heightInCm) {
        // Convert height from cm to meters
        double heightInM = heightInCm / 100;

        // Calculate BMI
        double bmi = weight / (heightInM * heightInM);

        // Determine the status based on BMI
        String status;
        if (bmi < 18.5) {
            status = "Underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            status = "Normal weight";
        } else if (bmi >= 25 && bmi < 29.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        // Return the result as a string array
        return new String[]{String.format("%.2f", weight), String.format("%.2f", heightInCm), String.format("%.2f", bmi), status};
    }

    // Method to process the input data and compute BMI for each person
    public static String[][] processBMIData(double[][] data) {
        String[][] result = new String[10][4];

        // Process each person's data
        for (int i = 0; i < 10; i++) {
            result[i] = calculateBMIAndStatus(data[i][0], data[i][1]);
        }

        return result;
    }

    // Method to display the results in a tabular format
    public static void displayBMIResults(String[][] results) {
        System.out.printf("%-10s%-10s%-10s%-15s%n", "Weight(kg)", "Height(cm)", "BMI", "Status");
        System.out.println("------------------------------------------------------");

        // Display each person's BMI data
        for (int i = 0; i < 10; i++) {
            System.out.printf("%-10s%-10s%-10s%-15s%n", results[i][0], results[i][1], results[i][2], results[i][3]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a 2D array to store weight and height of 10 persons
        double[][] data = new double[10][2];

        // Take input for weight and height of each person
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for person " + (i + 1));
            System.out.print("Enter weight (in kg): ");
            data[i][0] = scanner.nextDouble();
            System.out.print("Enter height (in cm): ");
            data[i][1] = scanner.nextDouble();
        }

        // Process the data to compute BMI and status
        String[][] bmiResults = processBMIData(data);

        // Display the results
        displayBMIResults(bmiResults);

        scanner.close();
    }
}
