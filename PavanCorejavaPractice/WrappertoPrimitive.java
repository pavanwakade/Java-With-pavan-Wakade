package pavaaaaaan;

public class WrappertoPrimitive {
// Wrapper class  to Primitive data type 
	
	public static void main(String[] args) {
		
		
		Integer x = new Integer(10);
		int y=x.intValue();
		int z=x;
		System.out.println(x);
		System.out.println("converting Integer to int :"+y);
		System.out.println("unboxing :"+z);
		System.out.println();

//		
		
		Integer a = 115;
		Double b=165.65;
		Character c= 'D';
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println();
		
//		Number Class
		
		Double d1 = new Double("4.2365");
		byte bb = d1.byteValue();
		short ss =d1.shortValue();
		int ii =d1.intValue();
		long ll =d1.longValue();
		float ff =d1.floatValue();
		double dd =d1.doubleValue();
		
		System.out.println("Converting Double to byte : " +bb);
		System.out.println("Converting Double to short : " +ss);
		System.out.println("Converting Double to integer : " +ii);
		System.out.println("Converting Double to long : " +ll);
		System.out.println("Converting Double to float : " +ff);
		System.out.println("Converting Double to double : " +dd);
		System.out.println();
		
		
	Integer d=5;
	Double e=5.55;
	Character f='z';
	System.out.println(d.intValue());
	System.out.println(e.doubleValue());
		System.out.println(f.charValue());
	}

}
