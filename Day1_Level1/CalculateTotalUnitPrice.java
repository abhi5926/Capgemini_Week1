//Importing scanner class liberaries
import java.util.Scanner;
//creating class  CalculateTotalPrice to calculate unitPrice and quantity
class CalculateTotalUnitPrice{
   public static void main(String args[]){
	 //Creating object of Scanner class
   Scanner input = new Scanner(System.in);
   //Creating variable name unitPrice type float
    float unitPrice;
	//Creating variable name quantity type float
	int quantity;
	
	//Display message
	System.out.println("Enter the unitPrice ");
	//Taking user input
	unitPrice = input.nextFloat();
	//Display message
	System.out.println("Enter the quantity ");
	//Taking user input
	quantity = input.nextInt();
	//Calculate the total price and store in the variable totalPrice
	double totalPrice = unitPrice * quantity ;
	//Display output
	System.out.println("The total purchase price is INR "+totalPrice+ "if the quantity "+ quantity+"and unit price is INR" +unitPrice);

	

   }
}