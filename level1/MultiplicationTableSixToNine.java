
//Importing Scanner class liberaries
import java.util.Scanner;
// Creating class name MultiplicationTableSixToNine

public class MultiplicationTableSixToNine{
  public static void main(String[] args) {
  
       // Creating a Scanner class object 
       Scanner input = new Scanner(System.in);
	   //creating variable name number of type int
	   int number;
	   System.out.println("Enter the nuber");
	   number=input.nextInt();
	   
	   int[] multiplicationResult=new int[3];
	   
	   for(int i=0;i<multiplicationResult.length;i++){
		   multiplicationResult[i]=number * (i+5);
		   System.out.println("The multiplication "+number +"*"+ (i+6) +"="+multiplicationResult[i]);
	   }
	   
     
    }
}