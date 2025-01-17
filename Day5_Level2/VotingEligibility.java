import java.util.Scanner;

class VotingEligibility {

    // Method to generate random 2-digit ages for n students and return the 1D array of ages
    public static int[] generateRandomAges(int n) {
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = (int)(Math.random() * 100); // Random ages between 0 and 99
        }
        return ages;
    }

    // Method to check voting eligibility and return a 2D array of age and eligibility status
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] eligibilityStatus = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            if (ages[i] < 0) {
                eligibilityStatus[i][0] = "Invalid Age";
                eligibilityStatus[i][1] = "Cannot Vote";
            } else if (ages[i] >= 18) {
                eligibilityStatus[i][0] = String.valueOf(ages[i]);
                eligibilityStatus[i][1] = "Can Vote";
            } else {
                eligibilityStatus[i][0] = String.valueOf(ages[i]);
                eligibilityStatus[i][1] = "Cannot Vote";
            }
        }
        return eligibilityStatus;
    }

    // Method to display the 2D array in a tabular format
    public static void displayEligibilityStatus(String[][] eligibilityStatus) {

        for (int i = 0; i < eligibilityStatus.length; i++) {
            System.out.printf("%-10s\t%-10s\n", eligibilityStatus[i][0], eligibilityStatus[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the number of students (10 students in this case)
        System.out.println("Enter the number of students (e.g., 10):");
        int numberOfStudents = scanner.nextInt();

        // Generate random ages for the students
        int[] studentAges = generateRandomAges(numberOfStudents);

        // Check voting eligibility based on ages
        String[][] eligibilityStatus = checkVotingEligibility(studentAges);

        // Display the eligibility status in a tabular format
        displayEligibilityStatus(eligibilityStatus);

        scanner.close();
    }
}
