import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    
    // Method to generate 
    public static int generateGuess(int low, int high) {
        Random rand = new Random();
        return rand.nextInt(high - low + 1) + low; 
    }
    
    // Method to get user feedback on the guess
    public static String getFeedback(int guess) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Is the guess " + guess + "? (high/low/correct): ");
        return scanner.nextLine().toLowerCase();
    }
    
    // Method to play the guessing game
    public static void playGame() {
        Scanner scanner = new Scanner(System.in);
        int low = 1, high = 100;
        int guess;
        String feedback;
        
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Think of a number between 1 and 100, and I will try to guess it.");

        
            guess = generateGuess(low, high);  // Generate a random guess between low and high
            feedback = getFeedback(guess);  // Get feedback from the user
            
            if (feedback.equals("high")) {
                high = guess - 1;  // If the guess is too high, narrow the range
            } else if (feedback.equals("low")) {
                low = guess + 1;  // If the guess is too low, increase the range
            }
         
        
        System.out.println("Yay! I guessed the correct number!");
    }

    public static void main(String[] args) {
        playGame();  // Start the game
    }
}
