
//Importing Scanner class liberaries
import java.util.Scanner;
// Creating class name SaveOddEvenNumber

public class SaveOddEvenNumber{
  public static void main(String[] args) {
  
       // Creating a Scanner class object 
       Scanner input = new Scanner(System.in);
	   //creating variable name integer of type integer
	   int number;
	   System.out.println("Enter the number");
	   number= input.nextInt();
	   //checking the natural number
	   if(number < =0){
		   System.out.println("Enter the valid number");
		   break;
	   }
	   //creating variable name size of type integer
	   int size=number / (2+1);
	   
	   int[] oddArray = new int[size];
	   int[] evenArray = new int[size];
	   //storing the value in odd and even array
	   for(int i=0;i<number;i++){
		   if(i % 2 == 0){
			   evenArray[i] = i;
		   }
		   else{
			   oddArray[i] = i;
		   }
	   }
	   for(int i=0;i<size;i++){
	   System.out.println("Even array is "+evenArray[i]);
	   System.out.println("odd array is "+oddArray[i]);
	   }
    }
}