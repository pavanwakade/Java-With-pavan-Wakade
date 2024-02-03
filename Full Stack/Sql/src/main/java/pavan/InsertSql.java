package pavan;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.util.Scanner;

public class InsertSql 
{
	public static void main(String[] args) 
	{
	String roll_No;
	String Name; 
	String age;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a Roll no");
	roll_No=sc.nextLine();
	
	System.out.println("Enter a Name");
	Name=sc.nextLine();
	
	System.out.println("Enter a age");
	age=sc.nextLine();
	
	try 
	{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection  con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Bank","root","pavan");
	Statement stmt=con.createStatement();
	String insert="insert into students values('"+roll_No+"', '"+Name+"','"+age+"')";
     stmt.executeUpdate(insert);
	System.out.println("Record SucessFull");
	}
	catch(Exception  e)
	{
		System.out.println("ERROR"+e.toString());
	}
	
	}
}
