
//Importing Scanner class liberaries
import java.util.Scanner;
// Creating class name CheckNumberIsPositiveNegative

public class CheckNumberIsPositiveNegative{
  public static void main(String[] args) {
  
       // Creating a Scanner class object 
       Scanner input = new Scanner(System.in);
	   
	   // Creating variable for store size of array
	   int arrSize = 5;
	   //Decleare array of type int
	   int[] Array=new int[arrSize];
	   //running loop 
	   for(int i=0;i<arrSize;i++){
		   System.out.println("Enter the value");
	   Array[i]=input.nextInt();
	   }
	   //running loop to Display output
	  for(int i=0;i<arrSize;i++){
		  //checking positive
	  if(Array[i] > 0){
		  //checking even number
	   if(Array[i] % 2 ==0){
	   System.out.println("The number is even"+ Array[i] );
	   }
	   else{
	   System.out.println("The number is odd"+ Array[i] );
	   }
	  }
	  else if(Array[i] < 0){
	      System.out.println("The number is negative");
	  }
	  else{
	    System.out.println("The number is zero");
	  }
	  }
     
    }
}