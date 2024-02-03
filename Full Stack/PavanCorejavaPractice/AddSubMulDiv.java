package coreJava;
import java.util.*;
public class AddSubMulDiv 
{ 
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a 1st no.");
		int a=sc.nextInt();
		System.out.println("Enter a 2nd no.");
		int b=sc.nextInt();
		 System.out.println("Addition ="+(a+b));
		 System.out.println("Subsraction ="+(a-b));
		 System.out.println("multiplication = "+(a*b));
		 System.out.println( "dividion = "+(a/b));
	}
}