package practis;

import java.util.Scanner;

public class TotalSalaryofanEmployee 
{
	
	public static void main(String[] args)
	{ int withdraw;
		int bs,pf,diposit,GrossSal;
		Scanner sc=new Scanner(System.in);
		System.out.println("Entger the basic Sallary");	
		bs=sc.nextInt();
		System.out.println("Entger your pf ");	
		pf=sc.nextInt();
		GrossSal=bs-pf;
		System.out.println("your Gross Sallary=  "+GrossSal);	
		System.out.println("Entger yourdiposit ");	
		diposit=sc.nextInt();
		GrossSal=GrossSal+diposit;
		System.out.println("Entger the withdraw amount ");	
		withdraw=sc.nextInt();	
		if(withdraw<= GrossSal)
		{
			GrossSal=GrossSal-withdraw;
			
		}
		else {
			System.out.println("not sufficiant balance ");	
		
			}
		System.out.println("your available balance=  "+GrossSal);	
		}
		
	

}