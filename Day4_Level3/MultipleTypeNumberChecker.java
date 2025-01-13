public class MultipleTypeNumberChecker{

    // Method to find factors of a number and return them as an array
    public static int[] findFactors(int number) {
        int[] factors = new int[number / 2 + 1]; 
        int count = 0;
        
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                factors[count] = i; 
                count++;
            }
        }
        
        // Resize the array to the actual number of factors
        int[] actualFactors = new int[count];
        System.arraycopy(factors, 0, actualFactors, 0, count);
        return actualFactors;
    }

    // Method to find the sum of factors
    public static int sumOfFactors(int number) {
        int sum = 0;
        int[] factors = findFactors(number);
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to find the product of factors
    public static int productOfFactors(int number) {
        int product = 1;
        int[] factors = findFactors(number);
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to check if a number is a perfect number
    public static boolean isPerfectNumber(int number) {
        return sumOfFactors(number) == number;
    }

    // Method to check if a number is an abundant number
    public static boolean isAbundantNumber(int number) {
        return sumOfFactors(number) > number;
    }

    // Method to check if a number is a deficient number
    public static boolean isDeficientNumber(int number) {
        return sumOfFactors(number) < number;
    }

    // Method to find the factorial of a digit
    public static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    // Method to check if a number is a strong number
    public static boolean isStrongNumber(int number) {
        int temp = number;
        int sum = 0;
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == number;
    }

    public static void main(String[] args) {
        int number = 145;  // Example number, you can change this to test other numbers

        // Find factors of the number
        int[] factors = findFactors(number);
        System.out.print("Factors of " + number + ": ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();

        // Check for Perfect number
        if (isPerfectNumber(number)) {
            System.out.println(number + " is a Perfect Number.");
        } else {
            System.out.println(number + " is not a Perfect Number.");
        }

        // Check for Abundant number
        if (isAbundantNumber(number)) {
            System.out.println(number + " is an Abundant Number.");
        } else {
            System.out.println(number + " is not an Abundant Number.");
        }

        // Check for Deficient number
        if (isDeficientNumber(number)) {
            System.out.println(number + " is a Deficient Number.");
        } else {
            System.out.println(number + " is not a Deficient Number.");
        }

        // Check for Strong number
        if (isStrongNumber(number)) {
            System.out.println(number + " is a Strong Number.");
        } else {
            System.out.println(number + " is not a Strong Number.");
        }
    }
}
