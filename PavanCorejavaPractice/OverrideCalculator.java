package pavaaaaaan;
class Add{
	void add(String a,String b) {
		System.out.println(a+b);
	}
}
class sub extends Add{
	void add(double a,double b) {
		System.out.println(a-b);
	}
}
class mul extends sub{
	void add(int a,int b) {
		System.out.println(a*b);
	}
}
public class OverrideCalculator {
	public static void main(String[] args) {
		mul aa= new  mul();
		aa.add("i am", " pavan");
		 aa.add(5, 5);
		aa.add(5.5, 5.5);
	}

}
