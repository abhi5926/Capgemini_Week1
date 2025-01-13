import java.util.Scanner;
//creating class name MatrixToArray 
public class MatrixToArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for number of rows and columns
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        // Create a 2D array  based on user input
        int[][] matrix = new int[rows][columns];

        // Take user input to fill the 2D array
        System.out.println("Enter the elements of the matrix");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter element at position  ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Create a 1D array to store the elements of the 2D array
        int[] oneDArray = new int[rows * columns];
        
        // Copy elements from the 2D array to the 1D array
        int i = 0;  // To keep track of the position in the 1D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                oneDArray[index] = matrix[i][j];  
                i++;  
            }
        }

        // Display the 1D array
        System.out.println("The elements of the 1D array are:");
        for (int i = 0; i < oneDArray.length; i++) {
            System.out.print(oneDArray[i] + " ");
        }

     
    }
}
