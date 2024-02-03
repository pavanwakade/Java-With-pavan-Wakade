package pavaaaaaan;

abstract class Animal
{
	public abstract void sound();
}
public class Abstract extends Animal
{
public void sound()
{
	System.out.println("this is a pavan");	
}
	public static void main(String[] args) {
		 Abstract aa=new Abstract();
		aa.sound();
	}
}