package PavanPractis;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.util.Scanner;

public class HostelDtabase 
{
	public static void main(String[] args) 
	{
		String Enter;
		int pin=123456;
		String Name;
		String Registernumber;
		String DOB;
		String Age;
		String Contactnumber;
		String Payment;
		
		
		Scanner sc=new Scanner(System.in);
		
		
		
		
		try 
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection  con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Hostel","root","pavan");
		Statement stmt=con.createStatement();
		//String create="create table if not exists hostel(Name varchar(50),DOB date,age int,Contactnumber int,Payment int)";
 
		//System.out.println("Enter password");
//		int b=sc.nextInt();
//        if(pin==b)
        {
			System.out.println("insert");
			System.out.println("update");
			Enter = sc.nextLine();
			
       switch(Enter) 
       {
       case"insert":
    	   System.out.println("enter the Full Name");
    	   Name=sc.nextLine();
    	   
    	   System.out.println("Enter REgister NO");
    	   Registernumber=sc.nextLine();
    	   
    	   System.out.println("enter the Age");
    	   Age=sc.nextLine();
    	   
    	   System.out.println("enter the Contactnumber");
    	   Contactnumber=sc.nextLine();
    	   
    	   System.out.println("enter the Payment");
    	   Payment=sc.nextLine();
       
		String insert="insert into Hostel values('"+Name+"', '"+Registernumber+"','"+Age+"', '"+Contactnumber+"', '"+Payment+"')";
	     stmt.executeUpdate(insert);  
		System.out.println("Creat SucessFull");
		 break;
		 
		 
       case"update":
    
    	   System.out.println("Name");
			System.out.println("Age");
			System.out.println("contact");
			System.out.println("payment");
			String updte=sc.nextLine();
			
			                    switch(updte) 
		                           {
		                     case"Name":
		                    	 System.out.println("enter the Full Name for update");
		                  	   Name=sc.nextLine();
		                  	   
		                  	 System.out.println("enter the Registernumber for update Name");
		                  	Registernumber=sc.nextLine();
		                  	   
   	                                String update="update Hostel set Name='"+Name+ "'where Registernumber="+Registernumber+"";
 	                                stmt.executeUpdate(update);
 	                                       	System.out.println("Record SucessFull");
 		                                     break;
		 
		                      case"Age":
		                    	  System.out.println("enter the Age for update");
		                   	   Age=sc.nextLine();
		                   	 System.out.println("enter the Registernumber for update whose Age");
		                   	Registernumber=sc.nextLine();
		    	                     String update1="update Hostel set Age='"+Age+ "'where Registernumber="+Registernumber+"";
		  	                         stmt.executeUpdate(update1);
		  		                            System.out.println("Record SucessFull");
		  		                              break;
		  		                              
		                      case"contact":
		                    	  System.out.println("enter the Contactnumber for update");
		                    	  Contactnumber=sc.nextLine();
		                   	 System.out.println("enter the Registernumber for update whose contact");
		                   	Registernumber=sc.nextLine();
		    	                     String update2="update Hostel set Contactnumber='"+Contactnumber+ "'where Registernumber="+Registernumber+"";
		  	                         stmt.executeUpdate(update2);
		  		                            System.out.println("Record SucessFull");
		  		                              break;
		  		                              
		                      case"payment":
		                    	  System.out.println("enter the payment for update");
		                    	  Payment=sc.nextLine();
		                   	 System.out.println("enter the Registernumber for update whose Payment");
		                   	Registernumber=sc.nextLine();
		    	                     String update3="update Hostel set Payment='"+Payment+ "'where Registernumber="+Registernumber+"";
		  	                         stmt.executeUpdate(update3);
		  		                            System.out.println("Record SucessFull");
		  		                              break;
		       
                                   default:
                                 System.out.println("Invalid choice");
                                     break;
		                                   }
			                    
			                    
       default:
           System.out.println("Invalid choice");
           break;
		}
		}
        
//		}
//		
//		else {
//			System.out.println("inbvalid  pin.");
//		}
		} 
		
		catch(Exception e)
		{
			
			System.out.println("ERROR"+e.toString());
		}
	}
	}
	