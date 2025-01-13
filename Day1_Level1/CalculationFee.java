// Creating PenDistributionProbelem class to Distribute the Pen Among Students
class CalculationFee{
  public static void main(String args[]){
  // Creating variable name fee and type int assign value 125000
  int fee = 125000;
  // Creating variable name discountParcent  and type int assign value 10
  int discountPercent = 10;
  // Calculating discount value and storing the value in variable name discount of type double
  double discount = (fee * discountPercent) / 100;
  // Calculating fee to pay value and storing the value in variable name feeToPay of type double
  double feeToPay = fee - discount ;
	
  System.out.println("The discount amount is INR " + discount +"and final discounted fee is INR "+ feeToPay);
  

  }
}