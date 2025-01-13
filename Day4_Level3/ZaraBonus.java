import java.util.Random;

public class ZaraBonus {

    // Method to generate random salary and years of service for employees
    public static int[][] generateEmployeeData(int numEmployees) {
        Random rand = new Random();
        int[][] employeeData = new int[numEmployees][2]; // 2D array to store salary and years of service

        for (int i = 0; i < numEmployees; i++) {
            // Generate a random 5-digit salary between 10000 and 99999
            employeeData[i][0] = rand.nextInt(90000) + 10000; // salary
            // Generate years of service between 1 and 20 years
            employeeData[i][1] = rand.nextInt(20) + 1; // years of service
        }
        return employeeData;
    }

    // Method to calculate the new salary, bonus, and return the new data
    public static double[][] calculateNewSalaryAndBonus(int[][] employeeData) {
        int numEmployees = employeeData.length;
        double[][] newEmployeeData = new double[numEmployees][3]; // 2D array to store old salary, new salary, and bonus

        for (int i = 0; i < numEmployees; i++) {
            int oldSalary = employeeData[i][0];
            int yearsOfService = employeeData[i][1];
            double bonus = 0;

            // Bonus calculation based on years of service
            if (yearsOfService > 5) {
                bonus = oldSalary * 0.05; // 5% bonus if service > 5 years
            } else {
                bonus = oldSalary * 0.02; // 2% bonus if service <= 5 years
            }

            // New salary after adding the bonus
            double newSalary = oldSalary + bonus;

            // Storing old salary, new salary, and bonus in the new array
            newEmployeeData[i][0] = oldSalary;
            newEmployeeData[i][1] = newSalary;
            newEmployeeData[i][2] = bonus;
        }

        return newEmployeeData;
    }

    // Method to calculate the sum of old salaries, new salaries, and total bonus
    public static double[] calculateTotalAmounts(double[][] newEmployeeData) {
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        for (int i = 0; i < newEmployeeData.length; i++) {
            totalOldSalary += newEmployeeData[i][0];
            totalNewSalary += newEmployeeData[i][1];
            totalBonus += newEmployeeData[i][2];
        }

        return new double[]{totalOldSalary, totalNewSalary, totalBonus};
    }

    // Method to display the results in a tabular format
    public static void displayResults(int[][] employeeData, double[][] newEmployeeData, double[] totals) {
        System.out.println("Employee\tOld Salary\tNew Salary\tBonus");
        

        for (int i = 0; i < employeeData.length; i++) {
            System.out.print((i + 1) + "\t\t");
            System.out.print(employeeData[i][0] + "\t\t");
            System.out.print(String.format("%.2f", newEmployeeData[i][1]) + "\t\t");
            System.out.println(String.format("%.2f", newEmployeeData[i][2]));
        }

       
        System.out.println("Total Old Salary: " + totals[0]);
        System.out.println("Total New Salary: " + totals[1]);
        System.out.println("Total Bonus Amount: " + totals[2]);
    }

    public static void main(String[] args) {
        int numEmployees = 10; // Number of employees

        // Generate random salary and years of service for all employees
        int[][] employeeData = generateEmployeeData(numEmployees);

        // Calculate new salary, bonus, and return new employee data
        double[][] newEmployeeData = calculateNewSalaryAndBonus(employeeData);

        // Calculate total old salary, new salary, and total bonus
        double[] totals = calculateTotalAmounts(newEmployeeData);

        // Display the results in a tabular format
        displayResults(employeeData, newEmployeeData, totals);
    }
}
