import java.util.Scanner;

public class QuadraticRoot{
    
    // Method to find the roots 
    public static double[] findRoots(double a, double b, double c) {
        double delta = Math.pow(b, 2) - 4 * a * c; 

        if (delta > 0) {
            //Two real and distinct roots
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[] { root1, root2 };
        } else if (delta == 0) {
            
            double root = -b / (2 * a);
            return new double[] { root };
        } else {
            
            return new double[0];  
        }
    }

    public static void main(String[] args) {
        // Creating a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        //Taking input values for a, b, and c
        System.out.print("Enter the value of a: ");
        double a = input.nextDouble();
        
        System.out.print("Enter the value of b: ");
        double b = input.nextDouble();
        
        System.out.print("Enter the value of c: ");
        double c = input.nextDouble();
        
        //Finding the roots using the method
        double[] roots = findRoots(a, b, c);

        //Displaying the results
        if (roots.length == 0) {
            System.out.println("The equation has no real roots.");
        } else if (roots.length == 1) {
            System.out.println("The equation has one root: " + roots[0]);
        } else {
            System.out.println("The equation has two roots: " + roots[0] + " and " + roots[1]);
        }
    }
}
