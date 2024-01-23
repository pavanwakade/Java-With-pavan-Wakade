package practis;

import java.util.Scanner;

public class SimpleInterest {
	int si,p,r,t;
	
		
		void input()
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("Entger the principle ");	
		p=sc.nextInt();
		System.out.println("Entger the rate ");	
		r=sc.nextInt();
		System.out.println("Entger the time ");	
		t=sc.nextInt();
		}
		void display()
		
		{
			si=p*r*t;
			System.out.println("simple interest "+si);	
		}
		
		public static void main(String[] args)
		{
			 SimpleInterest ss=new  SimpleInterest();
			 ss.input();
			 ss.display();
		}
	}