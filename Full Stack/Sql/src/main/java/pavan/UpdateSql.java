package pavan;
	import java.sql.Connection;
	import java.sql.Statement;
import java.util.Scanner;
import java.sql.DriverManager;
	

	public class UpdateSql 
	{
		public static void main(String[] args) 
		{
		String roll_No;
		String Name; 
		String age;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Name for update");
		Name=sc.nextLine();
		System.out.println("Enter a Roll no for updsate");
		roll_No=sc.nextLine();
		try 
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection  con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Bank","root","pavan");
		Statement stmt=con.createStatement();
		
//		String insert="update students set Name='"+Name+ "'where roll_No="+29+"";
		String insert="update students set Name='"+Name+ "'where roll_No="+roll_No+"";
	     stmt.executeUpdate(insert);
		System.out.println("Record SucessFull");
		}
		catch(Exception  e)
		{
			System.out.println("ERROR"+e.toString());
		}
		
		}
	}

