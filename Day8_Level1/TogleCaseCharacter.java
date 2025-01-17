 //importing java liberaries
 import java.util.Scanner;
import java.util.*;
//Creating class to parform togle operation
class TogleCaseCharacter {
    public static void main(String argsp[]){
        //creating Scanner class object
        Scanner ob = new Scanner(System.in);
        //Defining String variable and taking user input
        String str;
        System.out.println("Please enter the string");
        str=ob.next();
        // Declearing  another result string to store result 
        String result="";
        // running loop to chechk
      for(int i=0;i<str.length();i++){
          if(Character.isUpperCase(str.charAt(i))){
              result =result + Character.toLowerCase(str.charAt(i));
          }else{
              result =result + Character.toUpperCase(str.charAt(i));
          }
      }
      //Display the output
        System.out.println("You entered string "+str + " toggal String " + result);

    }

}