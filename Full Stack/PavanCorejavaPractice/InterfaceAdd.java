package pavaaaaaan;

import java.util.Scanner;

interface A
{
void add();	
}
public class InterfaceAdd implements A {
public void add()
	{
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Entger the A ");	
		a=sc.nextInt();
		System.out.println("Entger the B ");	
		b=sc.nextInt();
		c=a+b;
		System.out.println("Addition = "+c);	
	}

	public static void main(String[] args) {
	
		InterfaceAdd dd=new InterfaceAdd();
		dd.add();
	}

}
