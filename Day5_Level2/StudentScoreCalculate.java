import java.util.Random;

class StudentScoreCalculate {

    // Method to generate random 2-digit scores for Physics, Chemistry, and Math for all students
    public static int[][] generateScores(int numStudents) {
        Random random = new Random();
        int[][] scores = new int[numStudents][3];  // 2D array to store scores for Physics, Chemistry, and Math

        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = random.nextInt(100);  // Physics score (0-99)
            scores[i][1] = random.nextInt(100);  // Chemistry score (0-99)
            scores[i][2] = random.nextInt(100);  // Math score (0-99)
        }

        return scores;
    }

    // Method to calculate the total, average, and percentage for each student
    public static double[][] calculateTotalAndPercentage(int[][] scores) {
        double[][] result = new double[scores.length][4];  // Array to store total, average, percentage

        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];  // Total marks
            double average = total / 3.0;  // Average marks
            double percentage = (total / 300.0) * 100;  // Percentage

            // Round off values to 2 decimal places
            result[i][0] = total;
            result[i][1] = Math.round(average * 100.0) / 100.0;
            result[i][2] = Math.round(percentage * 100.0) / 100.0;
        }

        return result;
    }

    // Method to calculate grade based on percentage
    public static String[] calculateGrades(double[][] result) {
        String[] grades = new String[result.length];

        for (int i = 0; i < result.length; i++) {
            double percentage = result[i][2];

            if (percentage >= 90) {
                grades[i] = "A+";
            } else if (percentage >= 80) {
                grades[i] = "A";
            } else if (percentage >= 70) {
                grades[i] = "B+";
            } else if (percentage >= 60) {
                grades[i] = "B";
            } else if (percentage >= 50) {
                grades[i] = "C+";
            } else if (percentage >= 40) {
                grades[i] = "C";
            } else {
                grades[i] = "F";
            }
        }

        return grades;
    }

    // Method to display the scorecard in a tabular format
    public static void displayScorecard(int[][] scores, double[][] result, String[] grades) {
       

        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%-10d %-10d %-10d %-10d %-10.2f %-10.2f %-10s\n",
                    (i + 1),
                    scores[i][0],
                    scores[i][1],
                    scores[i][2],
                    result[i][0],
                    result[i][2],
                    grades[i]);
        }
    }

    public static void main(String[] args) {
        int numStudents = 10;  // Number of students (can be adjusted)

        // Generate random scores for students
        int[][] scores = generateScores(numStudents);

        // Calculate total, average, and percentage for each student
        double[][] result = calculateTotalAndPercentage(scores);

        // Calculate grades based on percentage
        String[] grades = calculateGrades(result);

        // Display the scorecard for all students
        displayScorecard(scores, result, grades);
    }
}
