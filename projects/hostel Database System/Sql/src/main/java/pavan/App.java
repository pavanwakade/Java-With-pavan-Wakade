package pavan;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager ;
public class App {

	public static void main(String[] args) 
	{
		try 
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection  con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Bank","root","pavan");
		Statement stmt=con.createStatement();
		String create="create table if not exists students(roll_No int,Name varchar(30),age int)";
		
	     stmt.executeUpdate(create);  
		System.out.println("Creat SucessFull");
		}
		catch(Exception e)
		{
			System.out.println("ERROR"+e.toString());
		}
 
	}

}
