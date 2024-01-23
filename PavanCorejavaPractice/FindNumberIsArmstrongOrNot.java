package practis;

import java.util.Scanner;

public class FindNumberIsArmstrongOrNot {
    public static void main(String[] args) {
	    int num,number,temp,total=0;
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter the no");
	    num=sc.nextInt();
	    number=num;
	    int a=String.valueOf(num).length();
	    while(number >0)
	    {
		temp=num%10;
		total+=Math.pow(number,a);
		number/=10;
	    }
	    if(total== num)
	    System.out.println(num+" is an Armstrong num");
	    else
		System.out.println(num+" is not Armstrong");
    }

}
