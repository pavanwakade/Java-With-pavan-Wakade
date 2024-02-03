package PavanCorejavaPractice;
import java.util.Scanner;

public class AdditionOfDignol
{

 public static void main(String[] args)
 {
  int i,j,c,d,sum = 0;
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the row size");
  c=sc.nextInt();
  System.out.println("enter the column size");
  d=sc.nextInt();
  int a[][]=new int[c][d];
  for(i=0;i<c;i++)
  {
   for(j=0;j<d;j++) 
   {
    System.out.println("Enter a number");
    a[i][j]=sc.nextInt();
    if(i == j) {
     sum=sum+a[i][j];
    }
   }
  }
for(i=0;i<c;i++)
{
 
 for(j=0;j<d;j++)
 {
  System.out.print(a[i][j]+ " ");
  
 }
 System.out.println( );
 
 }
System.out.println( );
System.out.println( "sum of dignol  " +sum);
 }

 
}