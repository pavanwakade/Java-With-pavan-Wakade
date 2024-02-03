package pavaaaaaan;

import java.util.ArrayList;

import java.util.Iterator;
import java.util.List;

public class Iteretor {

	public static void main(String[] args) {
	List aa=new ArrayList();
	aa.add("pavan");
	aa.add("ravan");
	aa.add("jivan");
	aa.add("savan");
	System.out.println("this is list  = "+aa);
	
	List a=new ArrayList();
	a.add(29);
	a.add(11);
	a.add(33);
	a.add(55);
	System.out.println("this is list  = "+a);
	aa.addAll(a);
	
	Iterator itr=aa.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	}
}
