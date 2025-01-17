import java.util.Scanner;
import java.util.*;

//creating class to check palindrome
class PalindromeCheck {
    
	 // method to reverse string
   public static String reverse(String string){
      String reverse ="";
	  
	  for(int i=string.length()-1;i >= 0;i--){
	      reverse = reverse + string.charAt(i);
	  }
	  return reverse;
   }
   // Main method
   public static void main(String args[]){
   
     // Creating the object of Scanner class
	 Scanner sc =new Scanner(System.in);
	  // creating variable of type string and taking user input
	 String string;
	 System.out.println("Please Enter the String :");
      string = sc.next();
    
	  // Storing result to the method
	  String reverse = reverse(string);
	  
	  boolean result = string.equals(reverse);
	  // Display the output
	  if(result == true){
	     System.out.println("String is palindrome :");
	  }else{
	    System.out.println("String is not Palindrome :");
	  }
	
   }
}