import java.util.Scanner;
import java.util.*;
//Creating class to print longest word 
class LongestWord{

    public static void main(String args[]){
	//Creating object of Scanner Class for taking user input
        Scanner ob =new Scanner(System.in);
        String str;
        System.out.println("Please Enter the String");
        str=ob.nextLine();
         // creating the string array to store strings
        String[] array=str.split(" ");
		// initializing longestWord variable to array[0] variable
        String longestWord=array[0];
		//running for each loop
        for(String word : array){
            if(word.length() > longestWord.length()){
                longestWord=word;
            }
        }
       // Display the output
        System.out.println(" Longest word in the string is  "+ longestWord);
    }
}