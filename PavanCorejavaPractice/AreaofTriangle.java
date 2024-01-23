package practis;

import java.util.Scanner;

public class AreaofTriangle 
{
	int h,b,areaofTrangle;
	void input()
	{
		Scanner sc=new Scanner(System.in);
	System.out.println("Entger the base of trangle ");	
	b=sc.nextInt();
	System.out.println("Entger the hight of trangle ");	
	h=sc.nextInt();
	}
	void Display()
	{
		areaofTrangle=h*b/2;	
		System.out.println("area of Trangle = "+areaofTrangle);	
	}
	public static void main(String[] args) {
		AreaofTriangle at=new AreaofTriangle();
		at.input();
		at.Display();

	}

}
