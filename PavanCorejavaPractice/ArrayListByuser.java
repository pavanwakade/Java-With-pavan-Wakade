package pavaaaaaan;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListByuser {

    public static void main(String[] args) {
	ArrayList pavan=new ArrayList();
Scanner sc=new Scanner(System.in);
System.out.println("enter a Array length");
int l=sc.nextInt();
for(int i=1;i<=l;i++)
{
	System.out.println("enter a no");
	pavan.add(sc.nextInt()); 
	}
System.out.println("ArayList = "+pavan);
 System.out.println("enter your choice");
		 int a=sc.nextInt();
		 System.out.println(a);
if (pavan.contains(a))
	{
	  pavan.remove(a);
System.out.println(a+" is removed from ArrayList");	  
	}
	else
	{
		System.out.println(a+" is not present in  ArrayList");	
	}
	System.out.println();	
	System.out.println("Updated ArrayListArrayList = "+pavan);	
    }
}