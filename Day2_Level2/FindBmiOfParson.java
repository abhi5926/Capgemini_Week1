//Importing Scanner class liberaries
import java.util.Scanner;
// Creating class name FindBmiOfParson
public class FindBmiOfParson{
  public static void main(String[] args) {
  
       // Creating a Scanner class object 
       Scanner input = new Scanner(System.in);
        
      // Declaring variables name weight and height of type double
      double weight, height;
        
      //Taking weight as input in kg
	  System.out.println("Enter weight");
	  weight = input.nextDouble();
	  
	   //Taking height as input in cm
	  System.out.println("Enter height");
	  height = input.nextDouble();
	  //Calculating BMI using formula in kg/m^2
	  double BmiCalculate = weight / (height * height);
	  //Converting it cm to meter
	  double BmiInMeter = BmiCalculate * 0.06;
	  
	  if(BmiInMeter <= 18.4)
	  {
	  System.out.println("Underweight");
	  }else if(BmiInMeter > 18.4 && BmiInMeter <= 24.9)
	  {
	  System.out.println("Normal");
	  }else if(BmiInMeter > 25.0 && BmiInMeter <= 39.9)
	  {
	  System.out.println("Overweight");
	  }
	  else{
	   System.out.println("Obese");
	  }
   }
}