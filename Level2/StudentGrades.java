import java.util.Scanner;

public class StudentGrades {

    // Method to calculate percentage
    public static double calculatePercentage(int physics, int chemistry, int maths) {
        int totalMarks = physics + chemistry + maths;
        return (totalMarks / 300.0) * 100;  // Total marks are 300
    }

    // Method to determine grade based on percentage
    public static String determineGrade(double percentage) {
        if (percentage >= 90) {
            return "A+";
        } else if (percentage >= 80) {
            return "A";
        } else if (percentage >= 70) {
            return "B";
        } else if (percentage >= 60) {
            return "C";
        } else if (percentage >= 50) {
            return "D";
        } else {
            return "F";  // Fail
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for number of students
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        // Arrays to store marks, percentage, and grade for each student
        int[][] marks = new int[numStudents][3];  // 3 columns: Physics, Chemistry, Maths
        double[] percentages = new double[numStudents];
        String[] grades = new String[numStudents];

        // Input marks for each student
        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nStudent " + (i + 1) + ":");

            // Input marks for Physics
            int physicsMarks;
            do {
                System.out.print("Enter marks for Physics (0-100): ");
                physicsMarks = scanner.nextInt();
                if (physicsMarks < 0 || physicsMarks > 100) {
                    System.out.println("Marks must be between 0 and 100. Please enter again.");
                }
            } while (physicsMarks < 0 || physicsMarks > 100);
            marks[i][0] = physicsMarks;

            // Input marks for Chemistry
            int chemistryMarks;
            do {
                System.out.print("Enter marks for Chemistry (0-100): ");
                chemistryMarks = scanner.nextInt();
                if (chemistryMarks < 0 || chemistryMarks > 100) {
                    System.out.println("Marks must be between 0 and 100. Please enter again.");
                }
            } while (chemistryMarks < 0 || chemistryMarks > 100);
            marks[i][1] = chemistryMarks;

            // Input marks for Maths
            int mathsMarks;
            do {
                System.out.print("Enter marks for Maths (0-100): ");
                mathsMarks = scanner.nextInt();
                if (mathsMarks < 0 || mathsMarks > 100) {
                    System.out.println("Marks must be between 0 and 100. Please enter again.");
                }
            } while (mathsMarks < 0 || mathsMarks > 100);
            marks[i][2] = mathsMarks;

            // Calculate percentage and grade
            percentages[i] = calculatePercentage(physicsMarks, chemistryMarks, mathsMarks);
            grades[i] = determineGrade(percentages[i]);
        }

        // Display marks, percentage, and grade for each student
        System.out.println("\nStudent Results:");
        System.out.println("-------------------------------------------------------------");
        System.out.printf("%-10s %-10s %-10s %-10s %-10s\n", "Student", "Physics", "Chemistry", "Maths", "Percentage", "Grade");
        System.out.println("-------------------------------------------------------------");
        for (int i = 0; i < numStudents; i++) {
            System.out.printf("%-10d %-10d %-10d %-10d %-10.2f %-10s\n", 
                    i + 1, marks[i][0], marks[i][1], marks[i][2], percentages[i], grades[i]);
        }

        // Close the scanner
        scanner.close();
    }
}
