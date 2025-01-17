import java.util.Scanner;

class VowelConsonentCountInString {

    // Method to check if the character is a vowel, consonant, or not a letter
    public static String checkCharacterType(char ch) {
        // Convert character to lowercase if it's an uppercase letter
        ch = Character.toLowerCase(ch);

        // Check if the character is a vowel
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return "Vowel";
        }
        // Check if the character is a consonant (i.e., a letter but not a vowel)
        else if ((ch >= 'a' && ch <= 'z')) {
            return "Consonant";
        }
        // If it's not a letter
        else {
            return "Not a Letter";
        }
    }

    // Method to find vowels and consonants in a string and return the character and its type in a 2D array
    public static String[][] findVowelsAndConsonants(String text) {
        String[][] result = new String[text.length()][2];

        // Loop through the string and check each character
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            String type = checkCharacterType(ch);
            result[i][0] = String.valueOf(ch); // Character
            result[i][1] = type; // Type (Vowel, Consonant, Not a Letter)
        }

        return result;
    }

    // Method to display the 2D Array of character types in a tabular format
    public static void displayCharacterTypes(String[][] result) {


        for (int i = 0; i < result.length; i++) {
            String character = result[i][0];
            String type = result[i][1];
            System.out.printf("%-10s\t%-10s\n", character, type);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.println("Enter a text:");
        String inputText = scanner.nextLine();

        // Find vowels and consonants and get the character types
        String[][] characterTypes = findVowelsAndConsonants(inputText);

        // Display the result in tabular format
        displayCharacterTypes(characterTypes);

        scanner.close();
    }
}
