import java.util.Scanner;

public class NumberCheck{

    // Method to check if the number is positive or negative
    public static String isPositive(int number) {
        if (number > 0) {
            return "Positive";
        } else if (number < 0) {
            return "Negative";
        } else {
            return "Zero";
        }
    }

    // Method to check if the number is even or odd
    public static String isEven(int number) {
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    // Method to compare two numbers
    public static int compare(int number1, int number2) {
        if (number1 > number2) {
            return 1;  
        } else if (number1 == number2) {
            return 0;  
        } else {
            return -1; // 
        }
    }

    public static void main(String[] args) {
        // Creating a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Declaring an array to store 5 numbers
        int[] numbers = new int[5];

        // Taking input for the 5 numbers
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = input.nextInt();
        }

        // Checking whether each number is positive or negative and even or odd
        for (int i = 0; i < numbers.length; i++) {
            String positivity = isPositive(numbers[i]);
            if (positivity.equals("Positive")) {
                System.out.println("Number " + numbers[i] + " is positive and " + isEven(numbers[i]) + ".");
            } else if (positivity.equals("Negative")) {
                System.out.println("Number " + numbers[i] + " is negative.");
            } else {
                System.out.println("Number " + numbers[i] + " is zero.");
            }
        }

        // Comparing the first and last elements of the array
        int comparisonResult = compare(numbers[0], numbers[4]);
        if (comparisonResult == 1) {
            System.out.println("The first element (" + numbers[0] + ") is greater than the last element (" + numbers[4] + ").");
        } else if (comparisonResult == 0) {
            System.out.println("The first element (" + numbers[0] + ") is equal to the last element (" + numbers[4] + ").");
        } else {
            System.out.println("The first element (" + numbers[0] + ") is less than the last element (" + numbers[4] + ").");
        }
    }
}
