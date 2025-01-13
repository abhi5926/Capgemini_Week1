import java.util.Scanner;

public class CollinearPoints {

    // Method to check if points are collinear using the slope formula
    public static boolean arePointsCollinearBySlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        // Calculate slopes AB and BC
        double slopeAB = (double)(y2 - y1) / (x2 - x1);
        double slopeBC = (double)(y3 - y2) / (x3 - x2);
        
        // Check if the slopes are equal
        return slopeAB == slopeBC;
    }

    // Method to check if points are collinear using the area of triangle formula
    public static boolean arePointsCollinearByArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        // Calculate the area of the triangle formed by points A(x1, y1), B(x2, y2), and C(x3, y3)
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        
        // Points are collinear if the area is zero
        return area == 0;
    }

    public static void main(String[] args) {
        // Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Take inputs for 3 points
        System.out.print("Enter coordinates for Point A (x1, y1): ");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();

        System.out.print("Enter coordinates for Point B (x2, y2): ");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        System.out.print("Enter coordinates for Point C (x3, y3): ");
        int x3 = scanner.nextInt();
        int y3 = scanner.nextInt();

        // Check if the points are collinear using the slope method
        boolean collinearBySlope = arePointsCollinearBySlope(x1, y1, x2, y2, x3, y3);
        if (collinearBySlope) {
            System.out.println("The points are collinear by the slope method.");
        } else {
            System.out.println("The points are NOT collinear by the slope method.");
        }

        // Check if the points are collinear using the area method
        boolean collinearByArea = arePointsCollinearByArea(x1, y1, x2, y2, x3, y3);
        if (collinearByArea) {
            System.out.println("The points are collinear by the area method.");
        } else {
            System.out.println("The points are NOT collinear by the area method.");
        }

        // Close the scanner
        scanner.close();
    }
}
