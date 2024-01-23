//
package pavaaaaaan;
class Animal1{
	void sound(int a)
	{
		System.out.println("this is the Animal");
	}
}
class dog extends Animal1{
	void sound() {
		System.out.println("this is a dog");
	}
}
class cat extends Animal1{
	void sound() {
		System.out.println("this is a cat");
	}
}
public class WrapperExample {

	public static void main(String[] args) {
	dog dd=new dog();
	dd.sound(1);
	dd.sound();
	cat cc=new cat();
	cc.sound();
	}
}
