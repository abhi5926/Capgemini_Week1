import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CardDeckGame {

    // Method to initialize the deck of cards with suits and ranks
    public static List<String> initializeDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        List<String> deck = new ArrayList<>();

        // Create the deck of cards
        for (String suit : suits) {
            for (String rank : ranks) {
                deck.add(rank + " of " + suit);
            }
        }

        return deck;
    }

    // Method to shuffle the deck of cards
    public static void shuffleDeck(List<String> deck) {
        int n = deck.size();

        // Shuffle the deck using the Fisher-Yates shuffle algorithm
        for (int i = 0; i < n; i++) {
            int randomCardNumber = i + (int) (Math.random() * (n - i));
            // Swap the current card with the random card
            String temp = deck.get(i);
            deck.set(i, deck.get(randomCardNumber));
            deck.set(randomCardNumber, temp);
        }
    }

    // Method to distribute the cards to players
    public static String[][] distributeCards(List<String> deck, int numOfCards, int numOfPlayers) {
        if (numOfCards % numOfPlayers != 0) {
            System.out.println("Cards cannot be evenly distributed among players.");
            return null;
        }

        // Create a 2D array to store players' cards
        String[][] players = new String[numOfPlayers][numOfCards / numOfPlayers];

        // Distribute the cards
        int cardIndex = 0;
        for (int i = 0; i < numOfPlayers; i++) {
            for (int j = 0; j < numOfCards / numOfPlayers; j++) {
                players[i][j] = deck.get(cardIndex++);
            }
        }

        return players;
    }

    // Method to print the players and their cards
    public static void printPlayersAndCards(String[][] players) {
        for (int i = 0; i < players.length; i++) {
            System.out.println("Player " + (i + 1) + ": " + Arrays.toString(players[i]));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize the deck
        List<String> deck = initializeDeck();
        System.out.println("Deck initialized.\n");

        // Shuffle the deck
        shuffleDeck(deck);
        System.out.println("Deck shuffled.\n");

        // Take user input for the number of cards and players
        System.out.print("Enter the number of cards to be dealt: ");
        int numOfCards = scanner.nextInt();

        System.out.print("Enter the number of players: ");
        int numOfPlayers = scanner.nextInt();

        // Distribute the cards and handle case where cards cannot be evenly distributed
        String[][] players = distributeCards(deck, numOfCards, numOfPlayers);

        if (players != null) {
            // Print the players and their cards
            printPlayersAndCards(players);
        }

        scanner.close();
    }
}
