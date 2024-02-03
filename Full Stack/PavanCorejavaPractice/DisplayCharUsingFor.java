package pavaaaaaan;

import java.util.Scanner;


public class DisplayCharUsingFor {
	public static void main(String[] args) 
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your Name");
		
	String s= sc.nextLine();
	int n=s.length();
	int i;
	for(i=0;i<n;i++)	
System.out.println(s.charAt(i) );
	}	
}
