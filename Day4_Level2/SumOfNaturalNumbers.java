import java.util.Scanner;

public class SumOfNaturalNumbers{

    //calculate the sum using recursion
    public static int recursiveSum(int n) {
        
        if (n == 1) {
            return 1;
        }
        // Recursive case: sum = n + sum of (n-1) numbers
        return n + recursiveSum(n - 1);
    }

    //calculate the sum using the formula 
    public static int formulaSum(int n) {
        return (n * (n + 1)) / 2;
    }

    public static void main(String[] args) {
        //Creating a Scanner object for input
        Scanner input = new Scanner(System.in);

        //Taking input from the user
        System.out.println("Enter a natural number:");
        int n = input.nextInt();

        // Checking if the input is a valid natural number (positive integer)
        if (n <= 0) {
            System.out.println("Please enter a valid natural number greater than 0.");
            return;
        }

        //Calculating the sum using recursion
        int sumRecursive = recursiveSum(n);

        //Calculating the sum using the formula
        int sumFormula = formulaSum(n);

        // Displaying the results
        System.out.println("Sum of first natural numbers using recursion " + sumRecursive);
        System.out.println("Sum of first natural numbers using formula " + sumFormula);

        // Comparing the results
        if (sumRecursive == sumFormula) {
            System.out.println("Both results are correct and match");
        } else {
            System.out.println("The results do not match.");
        }

        // Closing the scanner
        input.close();
    }
}
