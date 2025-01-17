import java.util.Scanner;
import java.util.*;
// Creating class name CountVowelsAndConsonent
class CountVowelsAndConsonent {
   // Method for counting vowels and consonenet
    public static void countingVowelsAndConsonentHelper(String str){
		// variables to store vowels and consonent of type integer
        int countVowel=0;
        int countConsonent=0;
		// running loop to count
        for(int i=0;i<str.length();i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == '0' || str.charAt(i) == 'u' || str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U') {
                countVowel++;
            }else{
                countConsonent++;
        }
        }
		// Display the output
        System.out.println("The vowels in string ="+countVowel);
        System.out.println("The consonent in string ="+countConsonent);
    }

    public static void main(String args[]){
		// Creating object of Scanner class
        Scanner ob= new Scanner(System.in);
		// Defining String variable display message and taking input in string from user
        String str;
        System.out.println("Please Enter the string");
        str=ob.nextLine();
		// calling method
        countingVowelsAndConsonentHelper(str);

    }
}