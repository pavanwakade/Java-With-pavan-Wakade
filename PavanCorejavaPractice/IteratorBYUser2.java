package pavaaaaaan;

import java.util.ArrayList;
import java.util.Scanner;

public class IteratorBYUser2 {

    public static void main(String[] args) {
	ArrayList pp=new ArrayList();
Scanner sc=new Scanner(System.in);
for(int i=0;i<=5;i++)
{
	System.out.println("enter a no");
	pp.add(sc.nextInt()); 
	}
	 System.out.println(pp);
    }
}