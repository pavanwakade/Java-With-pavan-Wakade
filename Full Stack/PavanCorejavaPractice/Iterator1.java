package pavaaaaaan;

import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Iterator1 {

    public static void main(String[] args) {
	ArrayList ab=new ArrayList();
	ab.add("29");
	ab.add("20");
	ab.add("27");
	ab.add("28");
	ab.add("26");
	System.out.println("this is 1st Array  "+   ab );

	ArrayList bb=new ArrayList();
	bb.add("pavan");
	bb.add("ravan");
	bb.add("savan");
	bb.add("shashi");
	bb.add("kedar");
	System.out.println("this is 1st Array  "+   bb );
	ab.addAll(bb);
	Iterator itr=ab.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
    }

}
