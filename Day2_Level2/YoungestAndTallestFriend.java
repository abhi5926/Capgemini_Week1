//Importing Scanner class liberaries
import java.util.Scanner;
// Creating class name YoungestAndTallestFriend
public class YoungestAndTallestFriend{
  public static void main(String[] args) {
  
       // Creating a Scanner class object 
       Scanner input = new Scanner(System.in);
        
      // Declaring variables name age and height of type int
      int ageAmar, ageAkbar, ageAnthony;
       double heightAmar, heightAkbar, heightAnthony;
	   
      //Taking ageAmar as input 
	  System.out.println("Enter ageAmar");
	 ageAmar= input.nextInt();
	 //Taking heightAmar as input 
	  System.out.println("Enter heightAmar");
	 heightAmar= input.nextDouble();
	 
	 //Taking ageAkbar as input 
	  System.out.println("Enter ageAkbar");
	 ageAkbar= input.nextInt();
	 //Taking heightAkbar as input 
	  System.out.println("Enter heightAkbar");
	 heightAkbar= input.nextDouble();
	 
	 //Taking ageAnthony as input 
	  System.out.println("Enter ageAnthony");
	 ageAnthony= input.nextInt();
	 //Taking heightAnthony as input 
	  System.out.println("Enter heightAnthony");
	 heightAnthony= input.nextDouble();
	 
	 if(ageAmar > ageAkbar && ageAmar > ageAnthony){
	 System.out.println("Amar is youngest");
	 }else if(ageAkbar > ageAmar && ageAkbar > ageAnthony){
	 System.out.println("Akbar is youngest");
	 }
	 else if(ageAnthony > ageAmar && ageAkbar < ageAnthony){
	 System.out.println("Anthony is youngest");
	 }
	 else{
	 System.out.println("All are equal");
	 }
	 
	 if(heightAmar > heightAkbar && heightAmar > heightAnthony){
	 System.out.println("Amar has largest height");
	 }else if(heightAkbar > heightAmar && heightAkbar > heightAnthony){
	 System.out.println("Akbar has largest height");
	 }
	 else if(heightAnthony > heightAmar && heightAkbar < heightAnthony){
	 System.out.println("Anthony has largest height");
	 }
	 else{
	 System.out.println("All are equal");
	 }
   }
}