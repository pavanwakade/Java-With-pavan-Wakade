package pavaaaaaan;

import java.util.Scanner;

interface Demo2
{
void show();	
}
class Demo3 
{
	int a=5,b=10,c;
	Scanner sc=new Scanner(System.in);
	
	void display()
	{
		System.out.println("Enter the A ");	
		a=sc.nextInt();                                                     
		System.out.println("Enter the B ");	
		b=sc.nextInt(); 
	c=a+b;
	System.out.println("Addition = "+c);
	}
}
public class InterfaceTwoclass extends Demo3 implements Demo2
{
public void show()
{
	System.out.println("Enter the A ");	
	a=sc.nextInt();                                                     
	System.out.println("Enter the B ");	
	b=sc.nextInt(); 
	c=a-b;
	System.out.println("substraction = "+c);	
}
	public static void main(String[] args) {
		InterfaceTwoclass ii=new InterfaceTwoclass();
ii.display();
ii.show();
	}

}
