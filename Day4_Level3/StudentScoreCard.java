import java.util.Random;
import java.util.Scanner;
public class StudentScoreCard {

    // Method to generate random 2-digit scores for Physics, Chemistry, and Math
    public static int[][] generateScores(int numStudents) {
        Random rand = new Random();
        int[][] scores = new int[numStudents][3]; // 2D array for storing Physics, Chemistry, and Math scores
        
        for (int i = 0; i < numStudents; i++) {
            // Generating random 2-digit scores (between 10 and 99 inclusive)
            scores[i][0] = rand.nextInt(90) + 10; // Physics
            scores[i][1] = rand.nextInt(90) + 10; // Chemistry
            scores[i][2] = rand.nextInt(90) + 10; // Math
        }
        
        return scores;
    }

    // Method to calculate total, average, and percentage for each student
    public static double[][] calculateResults(int[][] scores) {
        int numStudents = scores.length;
        double[][] results = new double[numStudents][4]; // 2D array to store total, average, and percentage
        
        for (int i = 0; i < numStudents; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;
            
            // Storing the results in the array, rounding off to 2 decimal places
            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        
        return results;
    }

    // Method to display the scorecard in a tabular format
    public static void displayScoreCard(int[][] scores, double[][] results) {
        System.out.println("Student\tPhysics\tChemistry\tMath\tTotal\tAverage\tPercentage");
        System.out.println("--------------------------------------------------------------");
        
        for (int i = 0; i < scores.length; i++) {
            System.out.print((i + 1) + "\t");
            // Displaying scores for Physics, Chemistry, Math, and corresponding total, average, and percentage
            System.out.print(scores[i][0] + "\t" + scores[i][1] + "\t" + scores[i][2] + "\t");
            System.out.print((int) results[i][0] + "\t" + results[i][1] + "\t" + results[i][2] + "%");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Taking the number of students as input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        
        // Generate random scores for all students
        int[][] scores = generateScores(numStudents);
        
        // Calculate total, average, and percentage for all students
        double[][] results = calculateResults(scores);
        
        // Display the scorecard in a tabular format
        displayScoreCard(scores, results);
    }
}
