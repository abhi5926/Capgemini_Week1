//Importing Scanner class liberaries
import java.util.Scanner;
// Creating CalculationFeeUserInput class to calculate the fee and discount
class CalculationFeeUserInput{
  public static void main(String args[]){
  //Creating object of Scanner class
  Scanner input = new Scanner(System.in); 
  

  // Creating variable name fee and type int 
  int fee;
  //Taking user input in variable fee of type int
  fee=input.nextInt();
  // Creating variable name discountParcent  and type int 
  int discountPercent;
  //Taking user input in discount variable
  discountPercent = input.nextInt();
  // Calculating discount value and storing the value in variable name discount of type double
  double discount = (fee * discountPercent) / 100;
  // Calculating fee to pay value and storing the value in variable name feeToPay of type double
  double feeToPay = fee - discount ;
	
  System.out.println("The discount amount is INR " + discount +"and final discounted fee is INR "+ feeToPay);
  }
}