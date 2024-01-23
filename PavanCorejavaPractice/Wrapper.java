package pavaaaaaan;

// Primitive Wrapper 

public class Wrapper {

	public static void main(String[] args) {
		
		
		
		int x=50;
		Integer y =Integer.valueOf(x);
		Integer z=x;
		System.out.println(x);
		System.out.println("Converting int into Integer " + y);
		System.out.println("Autoboxing - compiler automatically converts " + z);

	}

}
