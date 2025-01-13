
//Importing Scanner class liberaries
import java.util.Scanner;
// Creating class name CheckStudentEligibleForVote

public class CheckStudentEligibleForVote{
  public static void main(String[] args) {
  
       // Creating a Scanner class object 
       Scanner input = new Scanner(System.in);
	   
	   // Creating variable for store size of array
	   int arrSize = 10;
	   //Decleare array of type int
	   int []ageArray=new int[arrsize];
	   
	   for(int i=0;i<arrsize;i++){
	   ageArray[i]=input.nextInt();
	   }
	   
	  for(int i=0;i<arrsize;i++){
	  if(ageArray[i] >= 18){
	   System.out.println("The student with the age"+ageArray[i]+"can vote");
	  }
	  else{
	      System.out.println("The student with the age"+ageArray[i]+"can not vote");
	  }
	  }
     
    }
}