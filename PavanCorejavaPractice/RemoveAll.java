package pavaaaaaan;
import java.util.ArrayList;
public class RemoveAll {
	   
		public static void main(String[] args) {
			ArrayList ab=new ArrayList();
			ab.add("29");
			ab.add("ravan");
			ab.add("savan");
			ab.add("shashi");
			ab.add("kedar");
			

			ArrayList bb=new ArrayList();
			bb.add("29");
			bb.add("ravan");
			bb.add("savan");
			bb.add("shashi");
			bb.add("kedar");
			
			bb.removeAll(ab);                   // do Array marg karun  same element delete /remove karat  
			
			System.out.println();
			
				System.out.println(ab);
				System.out.println(bb);
				
				System.out.println(ab.size());   //Array size kitni hai batata hai
				
				ab.clear();                       // Array clesr karat (rikama karrt)
				
				System.out.println(ab.isEmpty());   // Array list empty aahe ka nahi te sangat
				
				
			}
		    }
		
