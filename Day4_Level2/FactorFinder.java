import java.util.Scanner;

public class FactorFinder{

    // Method to find the factors of the number and return them in an array
    public static int[] findFactors(int number) {
        // Count the number of factors first
        int count = 0;
        //Finding the count of factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        // Initialize the array to store factors
        int[] factors = new int[count];
        int index = 0;

        // Find and store the factors in the array
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index] = i;
                index++;
            }
        }
         return factors;
    }

    // Method to find the sum of the factors
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int i=0;i<factors.length;i++) {
            sum += i;
        }
        return sum;
    }

    // Method to find the product of the factors
    public static int productOfFactors(int[] factors) {
        int product = 1;
        for (int i=1;i<=factors.length;i++) {
            product *= i;
        }
        return product;
    }

    // Method to find the sum of the squares of the factors
    public static double sumOfSquaresOfFactors(int[] factors) {
        double sumOfSquares = 0;
        for (int factor : factors) {
            sumOfSquares += Math.pow(factor, 2);
        }
        return sumOfSquares;
    }

    public static void main(String[] args) {
        // Creating a Scanner object for input
        Scanner input = new Scanner(System.in);

        // Taking number input from the user
        System.out.println("Enter a number to find its factors:");
        int number = input.nextInt();
      //Displaying the factors
        System.out.println("The factors of " + number + " are:");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();

        // Calculating sum
        int sum = sumOfFactors(factors);
        int product = productOfFactors(factors);
        double sumOfSquares = sumOfSquaresOfFactors(factors);

        // Displaying the results
        System.out.println("Sum of factors " + sum);
        System.out.println("Product of factors " + product);
        System.out.println("Sum of squares of factors " + sumOfSquares);

        // Closing the scanner
        input.close();
    }
}
