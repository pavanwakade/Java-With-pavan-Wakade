package practis;

import java.util.Scanner;

public class PrintAsciiValueoftheCharacter 
{
	public static void main(String[] args) 
{
		char str1,str2;
		
		Scanner sc=new Scanner(System.in);	
		System.out.println("Enter the asciivalue 1");
		str1= sc.next().charAt(0); 
		System.out.println("Enter the asciivalue 2");
		str2= sc.next().charAt(0); 
		
		int ascci1=str1;
		int ascci2=str2;
		 
		System.out.println("The ASCII value of " + str1 + " is: " + ascci1);  
		System.out.println("The ASCII value of " + str2 + " is: " + ascci2);  
}  
} 