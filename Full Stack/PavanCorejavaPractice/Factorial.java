package practis;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
int i,fact=1,num;
Scanner sc=new Scanner(System.in);
System.out.println("Entger the number ");	
num=sc.nextInt();
for(i=1;i<=num;i++) {
	fact=fact*i;
}
System.out.println("factorial of "+num+" is =" +fact);	
	}

}
