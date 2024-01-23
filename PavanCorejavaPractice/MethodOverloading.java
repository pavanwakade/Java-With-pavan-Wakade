package pavaaaaaan;

public class MethodOverloading {
int add(int a,int b) {
	System.out.println("Addition of a and b");
	return a+b;
}
double add(double a,double b) {
	System.out.println("Addition of a and b");
	return a+b;
}
	public static void main(String[] args) {
		 MethodOverloading mm=new  MethodOverloading();
		 System.out.println( mm.add(3, 4));
		System.out.println( mm.add(3.5, 4.5));

	}

}
