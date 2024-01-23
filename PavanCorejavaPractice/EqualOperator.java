package pavaaaaaan;

public class EqualOperator
{
	public static void main(String[] args) {
		String s="Hell";
		String s1="Hello";
		String s2=new String("Hello");  // ==not work here
		boolean b=s1.equals(s2);
//		String s2="Hello";
//		boolean b=s1==s2;              // == work here
		System.out.println(b);
	}
}
