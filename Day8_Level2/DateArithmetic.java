import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateArithmetic {
    public static void main(String[] args) {
        // Create a scanner to take the date input
        Scanner scanner = new Scanner(System.in);
        
        // Define a date format pattern
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        
        // Prompt user for date input
        System.out.print("Enter a date (yyyy-MM-dd): ");
        String inputDate = scanner.nextLine();
        
        // Parse the input date into LocalDate
        LocalDate date = LocalDate.parse(inputDate, formatter);
        
        // Add 7 days, 1 month, and 2 years
        LocalDate newDate = date.plusDays(7).plusMonths(1).plusYears(2);
        
        // Subtract 3 weeks
        newDate = newDate.minusWeeks(3);
        
        // Output the result
        System.out.println("Resulting date after operations: " + newDate);
    }
}
