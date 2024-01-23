package pavaaaaaan;

public class widdningconverting {

	public static void main(String[] args) {
//		widdning
		int num = 10;
		System.out.println("this is int value "+num);
		double numd=num;
		System.out.println("this is convert int to double "+numd);
		System.out.println();
		
		
//		narrowing 
double a=10;
System.out.println("this is double "+a);
int b=(int)a;
System.out.println("this is is convert double to int  "+b);
System.out.println();


//convert int to string
int c=10;
System.out.println("this is int "+c);
String d=String.valueOf(c);
System.out.println("this is is convert int to String "+b);
System.out.println();

//convert string to int
String e="10";
System.out.println("this is String "+e);
int f=Integer.parseInt(e);
System.out.println("this is is convert  String to int "+f);
	}

}
