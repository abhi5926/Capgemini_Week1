import java.util.Scanner;
import java.util.*;
//creating class 
class MostFrequentCharacter {
    public static void main(String args[]){
	//creating object of Scanner class
	Scanner sc = new Scanner(System.in);
	// Creating variable of type string and taking user input to this variable
	  String string;
	  System.out.println("Please Enter the string");
	  string = sc.nextLine();
	  
	  //Creating character type array to calculate frequency
	  char[] freq = new char[256];
	  for(int i=0;i<string.length();i++){
	  freq[string.charAt(i)]++;
	  }
	  
	  //Defining variables
	  int max = 0;
	  char maxChar='0';
	  //Running loop
	  for(int i=0;i<string.length();i++){
	  if(freq[string.charAt(i)] > max){
	  max = freq[string.charAt(i)];
	  maxChar = string.charAt(i);
	  }
	  }
	  //Display the output
	  System.out.println("Maximum Frequency character is "+ maxChar);
	}
}