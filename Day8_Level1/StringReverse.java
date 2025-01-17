// Importing Packages
import java.util.Scanner;
import java.util.*;
// Creating class to reverse string  
class StringReverse{

    public static void main(String args[]){
	// creating object Of Scanner class
        Scanner ob =new Scanner(System.in);
		//Taking input to the user in string
        String str;
        System.out.println("Please Enter the String");
        str=ob.nextLine();
    // Creating Empty string 
        String rev_String="" ;
		// Reversing string by using loop
        for(int i=str.length()-1;i>=0;i--){

        rev_String = rev_String + str.charAt(i);

        }
		//Display revesed string
        System.out.println("The string "+ str +" is the resed string "+rev_String );
    }
}