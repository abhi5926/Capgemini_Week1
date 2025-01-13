public class NumberCheckerAnother{

    // Method to count the digits of a number
    public static int countDigits(int number) {
        return Integer.toString(number).length();
    }

    // Method to store the digits of a number in an array
    public static int[] storeDigits(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    // Method to find the sum of the digits of a number
    public static int sumOfDigits(int number) {
        int[] digits = storeDigits(number);
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    // Method to find the sum of the squares of the digits of a number
    public static double sumOfSquaresOfDigits(int number) {
        int[] digits = storeDigits(number);
        double sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }

    // Method to check if a number is a Harshad number
    public static boolean isHarshadNumber(int number) {
        int sum = sumOfDigits(number);
        return number % sum == 0;
    }

    // Method to find the frequency of each digit in the number
    public static int[][] digitFrequency(int number) {
        int[] digits = storeDigits(number);
        int[][] frequency = new int[10][2];  // Store digit and frequency (0-9)

        // Initialize frequency array
        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i;  // Set digit (0-9)
            frequency[i][1] = 0;  // Initialize frequency to 0
        }

        // Calculate frequency of each digit
        for (int digit : digits) {
            frequency[digit][1]++;
        }

        return frequency;
    }

    public static void main(String[] args) {
        int number = 21;  

        // Find and display the count of digits
        System.out.println("Count of digits: " + countDigits(number));

        // Store digits and display them
        int[] digits = storeDigits(number);
        System.out.print("Digits: ");
        for (int digit : digits) {
            System.out.print(digit + " ");
        }
        System.out.println();

        // Find and display the sum of digits
        System.out.println("Sum of digits: " + sumOfDigits(number));

        // Find and display the sum of squares of digits
        System.out.println("Sum of squares of digits: " + sumOfSquaresOfDigits(number));

        // Check and display if the number is a Harshad number
        if (isHarshadNumber(number)) {
            System.out.println(number + " is a Harshad Number.");
        } else {
            System.out.println(number + " is not a Harshad Number.");
        }

        // Find and display the frequency of each digit
        int[][] frequency = digitFrequency(number);
        System.out.println("Frequency of each digit");
        for (int i = 0; i < 10; i++) {
            if (frequency[i][1] > 0) {  
                System.out.println("Digit " + frequency[i][0] + ": " + frequency[i][1]);
            }
        }
    }
}
