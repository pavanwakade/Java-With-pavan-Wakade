package pavaaaaaan;
abstract class AbAndNormal
{
	public void Display()
	
		{
			System.out.println("this is normal method");	
		}
	abstract public void disp();
	}
 class AbstractAndNormal extends AbAndNormal
{
	public void disp()
	{
		System.out.println("this is body of ab method");

	}
	public static void main(String[] args)
	{
		 AbstractAndNormal ab=new  AbstractAndNormal();
ab.Display();
ab.disp();
	}

}
