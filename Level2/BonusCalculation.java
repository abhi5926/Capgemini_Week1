import java.util.Scanner;

public class BonusCalculation {

    public static void main(String[] args) {
        // Scanner to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Define arrays for employee data: old salary and years of service
        double[] salary = new double[10];
        double[] yearsOfService = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];

        // Variables to hold total bonus, old salary, and new salary
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        // Loop to take input for 10 employees
        for (int i = 0; i < 10; i++) {
            while (true) {
                System.out.print("Enter salary for employee );
                salary[i] = scanner.nextDouble();
                if (salary[i] <= 0) {
                    System.out.println("Invalid salary. Please enter a positive value.");
                    continue;
                }
                System.out.print("Enter years of service for employee ");
                yearsOfService[i] = scanner.nextDouble();
                if (yearsOfService[i] < 0) {
                    System.out.println("Invalid years of service. Please enter a non-negative value.");
                    continue;
                }
                break; 
            }
        }

        // Loop to calculate bonus and new salary
        for (int i = 0; i < 10; i++) {
            double employeeBonus = 0;

            // Calculate the bonus based on years of service
            if (yearsOfService[i] > 5) {
                employeeBonus = salary[i] * 0.05; // 5% bonus for more than 5 years
            } else {
                employeeBonus = salary[i] * 0.02; // 2% bonus for less than 5 years
            }

            // Store bonus in array
            bonus[i] = employeeBonus;

            // Calculate new salary 
            newSalary[i] = salary[i] + bonus[i];

            // Update total amounts
            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        // Display the total bonus payout, total old salary, and total new salary
        System.out.println("\nTotal bonus payout: " + totalBonus);
        System.out.println("Total old salary: " + totalOldSalary);
        System.out.println("Total new salary: " + totalNewSalary);

        
    }
}
