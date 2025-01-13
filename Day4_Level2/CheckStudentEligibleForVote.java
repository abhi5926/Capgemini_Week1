//Importing Scanner class libraries
import java.util.Scanner;

//Creating class name CheckStudentEligibleForVote
public class CheckStudentEligibleForVote{

    // Method to check if students are eligible to vote
    public static void checkEligibilityForVoting(int arrSize) {
        // Creating a Scanner class object 
        Scanner input = new Scanner(System.in);
        
        // Declaring an array to store the age of students
        int[] ageArray = new int[arrSize];
        
        // Taking input for the age of students
        for (int i = 0; i < arrSize; i++) {
            System.out.println("Enter the age of student " + (i + 1) + ":");
            ageArray[i] = input.nextInt();
        }
        
        //Checking if each student is eligible to vote
        for (int i = 0; i < arrSize; i++) {
            if (ageArray[i] >= 18) {
                System.out.println("The student with the age " + ageArray[i] + " can vote.");
            } else {
                System.out.println("The student with the age " + ageArray[i] + " cannot vote.");
            }
        }
    }

    public static void main(String[] args) {
        // Setting array size
        int arrSize = 10;
        
        // Calling the method to check eligibility for voting
        checkEligibilityForVoting(arrSize);
    }
}
