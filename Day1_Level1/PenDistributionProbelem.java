// Creating PenDistributionProbelem class to Distribute the Pen Among Students
class PenDistributionProbelem{
  public static void main(String args[]){
	// Create a variable name  totalPens type int and assign the value 14 and also we are creating another variable name totalStudents type int and assign value 3
	

  int totalPens = 14, totalStudents = 3;
  //Creating variable name stydentGetPen of type int and storing the value that how much pen get each one of student
  int studentGetPen = 14 / 3;
  // Creating variable name remainingPen of type int and storing the value of Undistributed Pen
  int remainingPen = 14 % 3;
  //Display output
  System.out.println("The Pen Per Student is " + studentGetPen +" and the remaining pen not distributed is " + remainingPen);
  }
}