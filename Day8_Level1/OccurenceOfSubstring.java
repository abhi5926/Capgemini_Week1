//importing liberaries
import java.util.Scanner;
import java.util.*;
//creating class to check occurence
class OccurenceOfSubstring {

    public static void main(String args[]){
        // creating object of Scanner class to take user input
        Scanner ob =new Scanner(System.in);
        // Defining string variable and taking user input
        String str;
        System.out.println("Please Enter the String");
        str=ob.nextLine();
        // defining index and count variable of type int assign value 0
        int index=0;
        int count=0;
        // Creating substring and taking user input in substring
        String subString;
        System.out.println("Enter the substring");
        subString=ob.nextLine();
       // countinf substring
        while((index = str.indexOf(subString,index))!=-1){
            count++;
            index= index +subString.length();
        }

        //Display the output
        System.out.println(" the occurence of string  "+str +" is "+ count);


    }
}