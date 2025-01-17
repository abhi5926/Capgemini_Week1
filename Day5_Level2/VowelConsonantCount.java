import java.util.Scanner;

class VowelConsonantCount {

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

    // Method to find vowels and consonants in a string and return their counts
    public static int[] countVowelsAndConsonants(String text) {
        int vowelsCount = 0;
        int consonantsCount = 0;

        // Loop through the string and check each character
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            String result = checkCharacterType(ch);

            // Count vowels and consonants
            if (result.equals("Vowel")) {
                vowelsCount++;
            } else if (result.equals("Consonant")) {
                consonantsCount++;
            }
        }

        // Return the counts as an array, where index 0 is vowels count, and index 1 is consonants count
        return new int[]{vowelsCount, consonantsCount};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.println("Enter a text:");
        String inputText = scanner.nextLine();

        // Find the vowels and consonants count using the user-defined method
        int[] counts = countVowelsAndConsonants(inputText);

        // Display the results
        System.out.println("Vowels Count: " + counts[0]);
        System.out.println("Consonants Count: " + counts[1]);

        scanner.close();
    }
}
