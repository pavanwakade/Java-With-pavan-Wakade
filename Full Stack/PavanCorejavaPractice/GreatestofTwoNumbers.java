package practis;

import java.util.Scanner;

public class GreatestofTwoNumbers {

	public static void main(String[] args) {
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");	
		a=sc.nextInt();
		System.out.println("Enter the number ");	
		b=sc.nextInt();
		if(a>b) {
			System.out.println("A is greater ");
		}
		else System.out.println("B            is greater");
	}

}
