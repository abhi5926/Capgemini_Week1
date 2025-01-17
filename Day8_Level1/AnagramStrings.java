import java.util.Scanner;
import java.util.*;
class AnagramStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string1,string2;
        System.out.println("Please Enter the first String ");
        string1 = sc.nextLine();
        System.out.println("Please Enter the second String ");
        string2 = sc.nextLine();
char[] arr1 = string1.toCharArray();
char[] arr2 = string2.toCharArray();
   
Arrays.sort(arr1);
Arrays.sort(arr2);
   if(string1.equalsIgnoreCase(string2)){
    System.out.println("String "+string1+" and "+string2+" are Anagram.");
   }else{
    System.out.println("String "+string1+" and "+string2+" are Not Anagram.");
   }
    }
}