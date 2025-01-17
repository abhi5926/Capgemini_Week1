import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        // Creating object of Scanner class
        Scanner scanner = new Scanner(System.in);
        
        // Defining variable to take user input as number
        System.out.print("Enter the number");
        int number = scanner.nextInt();
        
        // First two terms of Fibonacci series
        int first = 0, second = 1;
        
       
        
        // Print the Fibonacci series
        for (int i = 1; i <= number; ++i) {
            System.out.print(first+ ", ");
            
            
            int next = first + second;
            first = second;
            second = next;
        }
    }
}
