// Creating class naming CalculationProfitLoss to calculate Profit and Loss 
class CalculationProfitLoss{
  public static void main(String args[]){
   // creating variable costPrice of type int and assign the cost price in INR 129 and another variable sellingPrice of type int and assign the selling price in INR 191
    int costPrice = 129, sellingPrice = 191;
	
	// creating the variable name Profit of type int to store the profit price
	int profit;
	
	// calculating profit
	profit = sellingPrice - costPrice;
	
	// Creating the variable name profitParcentage to store the calculated value of profitParcentage
	 
	
	
	
	double profitPercentage = ((1.0 * profit) / costPrice) * 100;
	// Display profit and profit parcentage
	
	System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice + "\n" + "The Profit is INR " + profit +" and the Profit Percentage is " + profitPercentage);
	
	
}  
}