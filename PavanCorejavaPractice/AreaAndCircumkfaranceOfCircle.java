package practis;

import java.util.Scanner;

public class AreaAndCircumkfaranceOfCircle 
{
	int r,area,circumfofcr;
	
void input()
{
Scanner sc=new Scanner(System.in);	
System.out.println("Enter the radius");
r=sc.nextInt();

}
void areaCircumfarance()
{
	System.out.println("Area of circle = "+3.14*r*r);
	System.out.println("Circumfarance of circle = "+2*3.14*r);
}

	public static void main(String[] args)
	{
		 AreaAndCircumkfaranceOfCircle  cc=new  AreaAndCircumkfaranceOfCircle ();
cc.input();
cc.areaCircumfarance();
	}

}
