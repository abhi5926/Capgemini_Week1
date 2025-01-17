//importing java liberaries
import java.util.Scanner;
import java.util.*;
//Creating class to parform togle operation
class CompareLexicographically {
    public static void main(String argsp[]){

        //Defining String variable and assigning string
        String string1="apple";

        //Defining String variable and taking user input
        String string2="banana";

        int  result =string1.compareTo(string2);

        //Display the output
        if(result == -1){
            System.out.println(string1+" comes before "+ string2 +" in lexicographical order");
        }else{
            System.out.println(string2+" comes before "+ string1+" in lexicographical order");
        }


    }

}