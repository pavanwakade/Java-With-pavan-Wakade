package practis;

import java.util.Scanner;

public class TheGreatestNumberAmongtheGivenThreeNumber {

	public static void main(String[] args) {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Entger the A ");	
		a=sc.nextInt();
		System.out.println("Entger the B ");	
		b=sc.nextInt();
		System.out.println("Entger the C ");	
		c=sc.nextInt();
		if( a<=b&&c<=b) {
			System.out.println("b is greater");		
		}
	}

}
