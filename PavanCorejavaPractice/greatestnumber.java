package practis;


import java.util.Scanner;

public class greatestnumber 
{

	public static void main(String[] args) {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the A ");	
		a=sc.nextInt();
		System.out.println("Enter the B ");	
		b=sc.nextInt();
		System.out.println("Enter the c ");	
		c=sc.nextInt();
		if(a>b && a>c)
		{
			System.out.println(" A is Greater");	
		}
		else if(b>a && b>c)
			{
				System.out.println(" B is Greater");
			}
			else
			{
				System.out.println(" c is Greater");
			}
}	

}
