import java.util.Arrays;

public class FootballTeam {

    // Method to generate an array of random heights (150 cm to 250 cm)
    public static int[] generateRandomHeights(int size) {
        int[] heights = new int[size];
        for (int i = 0; i < size; i++) {
            heights[i] = (int) (Math.random() * 101) + 150;  // Random number between 150 and 250
        }
        return heights;
    }

    // Method to find the sum of heights
    public static int findSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }

    // Method to find the mean height
    public static double findMean(int[] heights) {
        int sum = findSum(heights);
        return (double) sum / heights.length;
    }

    // Method to find the shortest height
    public static int findShortest(int[] heights) {
        int shortest = heights[0];
        for (int height : heights) {
            if (height < shortest) {
                shortest = height;
            }
        }
        return shortest;
    }

    // Method to find the tallest height
    public static int findTallest(int[] heights) {
        int tallest = heights[0];
        for (int height : heights) {
            if (height > tallest) {
                tallest = height;
            }
        }
        return tallest;
    }

    public static void main(String[] args) {
        // Number of players in the football team
        int teamSize = 11;

        // Generate random heights for the players
        int[] heights = generateRandomHeights(teamSize);

        // Display the heights of all players
        System.out.println("Heights of the players (in cms): " + Arrays.toString(heights));

        // Find the sum of all heights
        int sum = findSum(heights);

        // Find the mean height
        double mean = findMean(heights);

        // Find the shortest height
        int shortest = findShortest(heights);

        // Find the tallest height
        int tallest = findTallest(heights);

        // Display the results
        System.out.println("\nResults");
        System.out.println("Sum of heights" + sum );
        System.out.println("Mean height" + mean );
        System.out.println("Shortest height" + shortest );
        System.out.println("Tallest height" + tallest );
    }
}
