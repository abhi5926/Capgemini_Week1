// Importing liberaries
import java.util.Scanner;
import java.util.*;
// Creating class to remove duplicates
class DuplicateRemove{

    public static void main(String args[]){
	//Creating object of Scanner class for user input
        Scanner ob =new Scanner(System.in);
		//Taking user input in string type of variable 
        String str;
        System.out.println("Please Enter the String");
        str=ob.nextLine();
         //creating result string to store single or not duplicate values
        StringBuilder result= new StringBuilder();
		// running loop to check and store character in result string
        for(int i=0;i<str.length();i++){
            if(result.indexOf(String.valueOf(str.charAt(i))) == - 1){
                result.append(str.charAt(i));
            }
        }
		//Display the output
        System.out.println(str+" Duplicate remove string is "+ result);


    }
}