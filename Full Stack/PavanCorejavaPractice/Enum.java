package pavaaaaaan;

public class Enum
{
	public enum month
	{
jan(1),FEB(2),march(3);
		private int value;
		private month(int value) 
		{
			this.value=value;
		}
		}
	public static void main(String[] args) 
	{
		for(month m:month.values())
		{
			System.out.println(m+" "+m.value);
	}
	}
}
	