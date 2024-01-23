package practis;
import java.util.*;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>a=new ArrayList<>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		System.out.println("ArrayList="+a);
		Iterator itr =a.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next()+" ");
		}
	}
			
		

	}


