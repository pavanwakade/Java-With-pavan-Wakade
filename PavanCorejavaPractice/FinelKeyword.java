package pavaaaaaan;
class Method
{
	final  void run(int a)            //final method do not over ride
	{
		System.out.println("final method");
	}
}
public class FinelKeyword extends Method 
{
final int sp=100;
void run()
{
//	sp=400;	
	System.out.println("final is not changble  try to change =  get error ");
}
	public static void main(String[] args) {
		FinelKeyword ff= new FinelKeyword();
		ff.run(5);
		ff.run();

}
}