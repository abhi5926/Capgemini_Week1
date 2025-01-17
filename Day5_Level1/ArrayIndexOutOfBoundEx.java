import java.util.Scanner;
import java.lang.ArrayIndexOutOfBoundsException;

class ArrayIndexOutOfBoundEx {

    // This method generates an ArrayIndexOutOfBoundsException 
    // by trying to access the 8th element (index 7) of an array 
    // which has fewer than 8 elements.
    public static void generateException(int[] array){
        int a = array[7];  // Trying to access the 8th element of the array (index 7)
        System.out.println("array of 11th index: " + a);  // Print statement
    }

    // This method handles the exception generated in the generateException method
    public static void handleException(int[] array){
        try {
            // Calling the method that might throw an exception
            generateException(array);
        }
        // Catch block to handle ArrayIndexOutOfBoundsException
        catch (ArrayIndexOutOfBoundsException ex) {
            // Printing the message when the exception occurs
            System.out.println("Please enter the valid array and its location to avoid ArrayIndexOutOfBoundsException");
        }
    }

    // Main method to execute the program
    public static void main(String[] args) {
        // Scanner object to read user input
        Scanner ob = new Scanner(System.in);

        // Creating an array of size 5
        int[] array = new int[5];

        // Asking the user to input the array elements
        System.out.println("Enter the array element");
        for (int i = 0; i < 5; i++) {
            // Reading elements from the user and storing them in the array
            array[i] = ob.nextInt();
        }

        // Calling the method to handle the exception
        handleException(array);
    }
}
