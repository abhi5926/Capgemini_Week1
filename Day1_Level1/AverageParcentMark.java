// Creating Class with name AverageParcentMark indicating the purpose is to display the parcent in PCM
// result. Notice the class name is a Noun.
public class AverageParcentMark{
    public static void main(String args[]){
	/* Create a int variable markInMaths and assign mark 94 and another variable markInPhysics and assign mark 95
   	and another variable markInChemistry and assign mark 96 out of 100 */
    
	int markInMaths=94, markInPhysics=95, markInChemistry=96;
	
	// Create a double variable averageMark and store the parcent value in this variable
     double averageMark;
	  
	// Calculating averageMark below
	
	averageMark =  (markInMaths +  markInPhysics + markInChemistry) / 3.0;
	//Display the averageMark
	System.out.println("Sam’s average mark in PCM is " + averageMark);

	}
}
