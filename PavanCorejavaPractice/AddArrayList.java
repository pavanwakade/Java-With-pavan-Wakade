package pavaaaaaan;

import java.util.ArrayList;

public class AddArrayList {

	public static void main(String[] args) {
		ArrayList<String>a1=new ArrayList<String>();
		a1.add("pavan");
		a1.add("shashi");
		a1.add("kedar");
		System.out.println(a1);
		ArrayList<String>a2=new ArrayList<String>();
		a2.add("sonali");
		a2.add("harshada");
		a2.add("chaiya");
System.out.println(a2);
a1.addAll(a2);
System.out.println(a1);

	}

}
