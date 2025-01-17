import java.util.Scanner;
import java.util.*;
 
 // Creating class name as PrimeNumberChecker
class PrimeNumberChecker {
   
   public static int primeCheck(int number){
      int count=0;
	  for(int i=2;i<=number;i++){
	  if(number % i ==0){
	  count++;
	  }
	  }
	  return count;
   }

   public static void main(String args[]){
   // creating object of the Scanner class
   Scanner sc =new Scanner(System.in);
   
   //Defining variable type int to store the number and taking user input
   int number;
   System.out.println("Please Enter the number");
   number = sc.nextInt();
   
   int  count =primeCheck(number);
   if(count == 2){
   System.out.println("The number "+ number +" is prime number.");
   }else{
   System.out.println("The number "+ number +" is Not prime number.");
   }
}
}