import java.util.Scanner;
import java.util.*;
class CompareTwoString {
	
	public static boolean compare(String str1, String str2){
		
		if(str1.length() != str2.length()){
			return false;
		}
		for(int i=0;i<str1.length();i++){
			if(str1.charAt(i) == str2.charAt(i)){
				return true;
			}
		}
		return false;
	}
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		String str1 ,str2;
		System.out.println("Enter the first String");
		str1=input.nextLine();
		System.out.println("Enter the second String");
		str2=input.nextLine();
		boolean result =compare(str1,str2);
		if(result == true)
		{
			System.out.println("String 1 "+str1+" String 2 "+str2 +"Both are same.");
		}else{
				System.out.println("String 1 "+str1+" String 2 "+str2 +"Both are not  same.");

		}
		
		
		
	}
}