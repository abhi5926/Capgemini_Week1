import java.util.Scanner;

public class BMICalculator{

    //Method to calculate BMI for each person
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightInMeters = data[i][1] / 100;  
            double bmi = weight / (heightInMeters * heightInMeters);
            data[i][2] = bmi; 
        }
    }

    // Method to determine the BMI status for each person
    public static String[] determineBMIStatus(double[][] data) {
        String[] statuses = new String[data.length];
        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];
            if (bmi < 18.5) {
                statuses[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi < 24.9) {
                statuses[i] = "Normal weight";
            } else if (bmi >= 25 && bmi < 29.9) {
                statuses[i] = "Overweight";
            } else {
                statuses[i] = "Obesity";
            }
        }
        return statuses;
    }

    // Main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 2D array to store weight, height (in cm), and BMI (BMI in 3rd column)
        double[][] data = new double[10][3]; // 10 members, 3 columns (weight, height, BMI)

        // Taking input for 10 team members (weight and height)
        System.out.println("Enter the weight (kg) and height (cm) for 10 team members");
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter weight (kg) for person " + (i + 1) );
            data[i][0] = input.nextDouble();

            System.out.println("Enter height (cm) for person " + (i + 1) );
            data[i][1] = input.nextDouble();
        }

        // Calculate BMI for each person
        calculateBMI(data);

        // Determine BMI status for each person
        String[] statuses = determineBMIStatus(data);

        
        for (int i = 0; i < 10; i++) {
            System.out.printf( i + 1, data[i][0], data[i][1], data[i][2], statuses[i]);
        }
    }
}
