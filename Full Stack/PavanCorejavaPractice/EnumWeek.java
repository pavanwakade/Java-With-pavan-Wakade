package pavaaaaaan;
public class EnumWeek {
	public enum week
	{
		monday(1),tusday(2),wensday(3),thusday(4),friday(5),saturday(6),sunday(7);
		private int value;
		private week(int value) 
		{
			this.value=value;
		}
	}
	public static void main(String[] args) 
	{
		for(week m:week.values())
		{
			System.out.println(m+" "+m.value);
	}
	}
}