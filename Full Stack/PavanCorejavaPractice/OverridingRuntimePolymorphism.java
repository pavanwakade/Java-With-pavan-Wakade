package practis;
class sonali
{	
void Show(int a) {
System.out.println( " this is a sonali");
}
}
class OverridingRuntimePolymorphism extends sonali
{
	void Show() {
		System.out.println( " this is a pavan");
		}
	public static void main(String[] args) {
		OverridingRuntimePolymorphism sp=new  OverridingRuntimePolymorphism ();
		sp.Show(9);
		sp.Show();
	}
}
