
//Importing Scanner class liberaries
import java.util.Scanner;
// Creating class name MultiplicationTable

public class MultiplicationTable{
  public static void main(String[] args) {
  
       // Creating a Scanner class object 
       Scanner input = new Scanner(System.in);
	   
	   // Creating variable for store the number
	   int number;
	   System.out.println("Enter the number");
	   number=input.nextInt();
	   //creating variable for store the size of array
	   int arrSize=10;
	   //Decleare array of type int
	   int[] Array=new int[arrSize];
	   //storing  
	   for(int i=1;i<=arrSize;i++){
		   
	   Array[i]=number * i;
	   }
	 //Display the output
	  for(int i=0;i<arrSize;i++){
		   System.out.println("Multiplication of the  number*i "+Array[i]);
	  }
     
    }
}