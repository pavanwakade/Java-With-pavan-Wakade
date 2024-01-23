package practis;

import java.util.Scanner;

public class numberisdivisiblebyFiveandElevenornot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");	
		int a=sc.nextInt();
		if(a%5==0)
		{
			System.out.println("number is divisibal by 5");
		}
		else if(a%11==0)
		{
			System.out.println("number is divisibal by 11");
		}
		else 
		{
			System.out.println("number is not divisibal by 11 and 5");
		}
	}

}
