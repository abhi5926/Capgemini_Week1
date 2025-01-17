import java.util.Scanner;
import java.util.*;
//creating class Name as Replace string
class ReplaceString {
    public static void main(String[] args) {
        //Creating the object Of Scanner Class
        Scanner sc = new Scanner(System.in);
        //Creating String Builder to enter text
       
        String  text = new String(" Hello World");
        //By using replace method we are replacing text
         String result = text.replaceAll("World", "Abhishek");
         // Display the output
        System.out.println("You Entered text = "+ text);
        System.out.println("Changed text = "+result);


    }
}
