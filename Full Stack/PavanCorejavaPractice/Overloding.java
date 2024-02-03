package pavaaaaaan;
class Overloding
{
void add(int a)
{
	System.out.println("this is int a int float ");
}


	void add(String s)
{
System.out.println("this is String");	

}
	
	
	void add(int b, double c)
	{
	System.out.println("this is int and float");	
	}
	
	
	void add(double a,int  b)
	{
	System.out.println("this is int and float");	
	}
	void add(int a,double b,String c) {
		System.out.println("this is int and float and string");
	}
	
public static void main(String[] args) {
	Overloding pp=new Overloding();
	pp.add(1);
	pp.add("pavan");
	pp.add(5, 0.5);
pp.add(1.4, 6);
pp.add(0,6.6,"pavan");
	}

}