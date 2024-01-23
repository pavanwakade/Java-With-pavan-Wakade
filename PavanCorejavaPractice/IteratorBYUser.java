package pavaaaaaan;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class IteratorBYUser {

    public static void main(String[] args) {
	ArrayList ab=new ArrayList();
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter a no");
	 ab.add(sc.nextInt());
	 ab.add(sc.nextInt());
	 ab.add(sc.nextInt());
	 ab.add(sc.nextInt());
	 ab.add(sc.nextInt());
	 System.out.println();
	 
	 System.out.println(ab);
	 System.out.println();
	 
	Iterator itr=ab.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());

    }

    }}
