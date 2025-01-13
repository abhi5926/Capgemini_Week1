import java.util.Scanner;

public class BMI_CalculatorRewrite {

    // Method to calculate BMI
    public static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }

    // Method to determine weight status based on BMI
    public static String getWeightStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            return "Normal weight";
        } else if (bmi >= 25 && bmi < 29.9) {
            return "Overweight";
        } else {
            return "Obesity";
        }
    }

    public static void main(String[] args) {
        // Create a scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Take input for number of persons
        System.out.print("Enter the number of persons: ");
        int numPersons = scanner.nextInt();

        // Create a multi-dimensional array to store weight, height, and BMI for each person
        double[][] personData = new double[numPersons][3];  // 3 columns: height, weight, BMI
        String[] weightStatus = new String[numPersons];  // Array to store weight status

        // Take input for each person's height and weight
        for (int i = 0; i < numPersons; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");

            // Input height (must be positive)
            double height;
            do {
                System.out.print("Enter height in meters (e.g., 1.75): ");
                height = scanner.nextDouble();
                if (height <= 0) {
                    System.out.println("Height must be a positive value. Please try again.");
                }
            } while (height <= 0);
            personData[i][0] = height;  // Store height in personData

            // Input weight (must be positive)
            double weight;
            do {
                System.out.print("Enter weight in kilograms (e.g., 70): ");
                weight = scanner.nextDouble();
                if (weight <= 0) {
                    System.out.println("Weight must be a positive value. Please try again.");
                }
            } while (weight <= 0);
            personData[i][1] = weight;  // Store weight in personData

            // Calculate BMI and store it in personData
            double bmi = calculateBMI(weight, height);
            personData[i][2] = bmi;

            // Determine weight status and store it in weightStatus
            weightStatus[i] = getWeightStatus(bmi);
        }

        // Display height, weight, BMI, and weight status for each person
        System.out.println("\n\nPerson Details (Height, Weight, BMI, Weight Status):");
        System.out.println("---------------------------------------------------------");
        for (int i = 0; i < numPersons; i++) {
            System.out.printf("Person %d: Height: %.2f m, Weight: %.2f kg, BMI: %.2f, Status: %s\n",
                    i + 1, personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }

    }
}
