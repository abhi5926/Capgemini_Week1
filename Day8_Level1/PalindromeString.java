
//importing java liberaries
import java.util.Scanner;
import java.util.*;
// creating class to check palindrome string
class PalindromeString{

    public static void main(String args[]){
	// creating object of Scanner class
        Scanner ob =new Scanner(System.in);
		// defining string variable and taking user input in string
        String str;
        System.out.println("Please Enter the String");
        str=ob.nextLine();
        // define empty string to store reverse string
        String rev_String="" ;
		// reversing string using loop
        for(int i=str.length()-1;i>=0;i--){

        rev_String = rev_String + str.charAt(i);

        }
		// Display output
        if(str.length() != rev_String.length()){
            System.out.println("The string "+ str +" is the reveresed string "+rev_String +" is not palindrome string");

        }
		// Disolay output in loop
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == rev_String.charAt(i)){
                System.out.println("The string "+ str +" is the reveresed string "+rev_String +" is  palindrome string");
                break;
            }else{
                System.out.println("The string "+ str +" is the reveresed string "+rev_String +" is not palindrome string");
                break;
                
            }
        }

    }
}