import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input: number of persons
        System.out.print("Enter the number of persons: ");
        int n = scanner.nextInt();
        
        // Arrays to store height, weight, BMI, and weight status
        double[] height = new double[n];
        double[] weight = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];
        
        // Input: height and weight for each person
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for person " + (i + 1));
            System.out.print("Height (in meters): ");
            height[i] = scanner.nextDouble();
            System.out.print("Weight (in kilograms): ");
            weight[i] = scanner.nextDouble();
            
            // Calculate BMI
            bmi[i] = weight[i] / (height[i] * height[i]);
            
            // Determine weight status based on BMI value
            if (bmi[i] < 18.5) {
                status[i] = "Underweight";
            } else if (bmi[i] >= 18.5 && bmi[i] < 24.9) {
                status[i] = "Normal weight";
            } else if (bmi[i] >= 25 && bmi[i] < 29.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        
        // Display the results
        System.out.println("\n--- BMI Calculation Results ---");
        System.out.printf("%-10s%-10s%-10s%-15s%-20s\n", "Person", "Height(m)", "Weight(kg)", "BMI", "Weight Status");
        for (int i = 0; i < n; i++) {
            System.out.printf("%-10s%-10s%-10s%-15s%-20s\n", i + 1, height[i], weight[i], bmi[i], status[i]);
        }
        
        scanner.close();
    }
}
