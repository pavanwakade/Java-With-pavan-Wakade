package practis;

import java.util.Scanner;

public class ReverseAgivenNumber {

    public static void main(String[] args) {
	int no,rev = 0,reverse;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a no");
	no=sc.nextInt();
	while( no!=0) 
	{
	   reverse=no%10; 
	rev=rev*10+reverse ;
	no=no/10;	
    }
System.out.println(rev);
    }
}
