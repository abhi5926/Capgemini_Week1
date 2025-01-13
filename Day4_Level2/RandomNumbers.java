import java.util.Arrays;

public class RandomNumbers{
    
    // Method to generate an array of 4-digit random numbers
    public static int[] generate4DigitRandomArray(int size) {
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = (int) (Math.random() * 9000) + 1000; 
        }
        return numbers;
    }

    // Method to find average, min, and max values in an array
    public static double[] findAverageMinMax(int[] numbers) {
        double[] results = new double[3];
        int sum = 0;
        int min = numbers[0];
        int max = numbers[0];

        for (int num : numbers) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        // Calculate average
        double average = sum / (double) numbers.length;

        // Store results
        results[0] = average;
        results[1] = min;
        results[2] = max;

        return results;
    }

    public static void main(String[] args) {
        // Generate an array of 5 random 4-digit numbers
        int size = 5;
        int[] randomNumbers = generate4DigitRandomArray(size);

        // Display the random numbers
        System.out.println("Generated 4-digit random numbers: " + Arrays.toString(randomNumbers));

        // Find average, minimum, and maximum
        double[] results = findAverageMinMax(randomNumbers);

        // Display the results
        System.out.println("Average: " + results[0]);
        System.out.println("Minimum value: " + results[1]);
        System.out.println("Maximum value: " + results[2]);
    }
}
