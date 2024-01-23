package pavaaaaaan;

import java.util.Scanner;

public class ConcatAndUppercase {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s1,s2;
	System.out.println("enter your string1 ");
	 s1=sc.nextLine();
	 System.out.println("enter your string2 ");
	 s2=sc.nextLine();
	 System.out.println("your String is "+s1);
	 System.out.println("length of s1 = "+s1.length());
	 System.out.println("length of s2 = "+s2.length());
	 System.out.println("concat = "+s1.concat(s2));
	 System.out.println("s lower case ="+s1.toLowerCase());
		System.out.println("s upper case ="+s1.toUpperCase());
	 
	
	}

}
