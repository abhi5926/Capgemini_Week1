//Creating Calss Name As RemoveSpecificCharacter
class RemoveSpecificCharacter {
     public static void main(String args[]){
		 //Creating Variable of Type String
	  String string = "Hello World";
	  //Using replace method to replace 
	  String result1 = string.replaceAll(String.valueOf('l'),"");
	  // Display the output
	  System.out.println("String "+result1);
	 }
}