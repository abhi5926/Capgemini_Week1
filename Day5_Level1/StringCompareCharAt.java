import java.util.Scanner;
import java.util.*;

class StringCompareCharAt{
	public static String strCompare(String str,int s_Index,int e_Index){
		StringBuilder newString=new StringBuilder();
		for(int i=s_Index;i<e_Index;i++)
		{
			newString.append(str.charAt(i));
			
		}
		return  newString.toString();
	}
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		String str;
		System.out.println("Enter the String");
		str=input.next();
		int s_Index,e_Index;
		System.out.println("Enter the start Index ");
		s_Index=input.nextInt();
		System.out.println("Enter the end Index ");
		e_Index=input.nextInt();
		String str1=str.substring(s_Index,e_Index);
		String str2=strCompare(str,s_Index,e_Index);
		
		if(str1.equals(str2)){
			System.out.println("String "+str1 +" and "+str2+" Both are same.");
			
		}else {
			System.out.println("String "+ str1 +" and "+ str2 +" Both are not same.");
		}
		}
}