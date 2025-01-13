import java.util.Scanner;

public class YoungestAndTallest {

    public static void main(String[] args) {
        // Scanner to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Arrays to store age and height of 3 friends
        int[] age = new int[3];
        double[] height = new double[3];

        // Taking input for age and height
        System.out.println("Enter the details for 3 friends:");

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age for friend " + (i + 1) + ": ");
            age[i] = scanner.nextInt();
            System.out.print("Enter height for friend " + (i + 1) + ": ");
            height[i] = scanner.nextDouble();
        }

        // Variables to store the youngest and tallest friend details
        int youngestAge = age[0];
        int youngestIndex = 0;
        double tallestHeight = height[0];
        int tallestIndex = 0;

        // Loop through the arrays to find the youngest and the tallest
        for (int i = 1; i < 3; i++) {
            if (age[i] < youngestAge) {
                youngestAge = age[i];
                youngestIndex = i;
            }

            if (height[i] > tallestHeight) {
                tallestHeight = height[i];
                tallestIndex = i;
            }
        }

        // Display the youngest and tallest friends
        System.out.println("\nYoungest Friend:");
        System.out.println("Friend " + (youngestIndex + 1) + " with age: " + youngestAge);

        System.out.println("\nTallest Friend:");
        System.out.println("Friend " + (tallestIndex + 1) + " with height: " + tallestHeight);

      
    }
}
