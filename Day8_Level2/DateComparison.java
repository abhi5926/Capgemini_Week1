import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateComparison {
    public static void main(String[] args) {
        // Create a scanner to take date input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Define the date format to be used for input parsing
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        
        // Prompt user to enter the first date
        System.out.print("Enter the first date (yyyy-MM-dd): ");
        String firstDateStr = scanner.nextLine();
        
        // Parse the first date
        LocalDate firstDate = LocalDate.parse(firstDateStr, formatter);
        
        // Prompt user to enter the second date
        System.out.print("Enter the second date (yyyy-MM-dd): ");
        String secondDateStr = scanner.nextLine();
        
        // Parse the second date
        LocalDate secondDate = LocalDate.parse(secondDateStr, formatter);
        
        // Compare the dates and display the result
        if (firstDate.isBefore(secondDate)) {
            System.out.println("The first date is before the second date.");
        } else if (firstDate.isAfter(secondDate)) {
            System.out.println("The first date is after the second date.");
        } else if (firstDate.isEqual(secondDate)) {
            System.out.println("The first date is the same as the second date.");
        }
    }
}
