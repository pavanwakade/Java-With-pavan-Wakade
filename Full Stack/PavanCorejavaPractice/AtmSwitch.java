package coreJavapractis;
import java.util.Scanner;
public class AtmSwitch {

public static void main(String[] args) {
			int pin=123456;
			String name;
			int acc;
			String mail;
			int b;
			int minbal=5000;
			int widraw;
		     int accbal = 5000;
		     int dipbal = 5000;
		     int totalbal;
			Scanner sc=new Scanner(System.in);
			System.out.println("enter pin no");
	        b=sc.nextInt();
			if(pin==b) {
			System.out.println("Chose any one from option");
			System.out.println("acc info");
			System.out.println("Diposit");
			System.out.println("widrowal");
			System.out.println("Check balance");
			System.out.println("Exit");
			int choice;
			choice=sc.nextInt();
			switch(choice){
			case 1:
				System.out.println("Account info");
				
				System.out.println("Enter thr Name");
				name=sc.nextLine();
				
				System.out.println("Enter thr Account no");
				acc=sc.nextInt();
				
				System.out.println("Enter thr Emailid");
				mail=sc.nextLine();
				
				System.out.println("Hii "+name+"Acc no "+acc+ "Emailid "+mail);
				break;
				
				
			case 2:
				System.out.println("you have choosen Diposit");
				System.out.println("Enter thr Deposit Ammolunt");
				dipbal=sc.nextInt();
				accbal=minbal+dipbal;
				System.out.println("Acc balance =  "+accbal);
				break;
				
				
			case 3:
				System.out.println("you have choosen widrowal");
				System.out.println("Enter thr Widrawal Ammount");
				widraw=sc.nextInt();
				
				if(widraw<=minbal) {
				accbal = dipbal+minbal;
				 totalbal=accbal-widraw;
				 System.out.println("Acc balance =  "+totalbal);
				}
				 else {
					 System.out.println("insufficiant balance");
					 }
				break;
				
				
			case 4:
				System.out.println("you have choosen Check Balance");
				System.out.println("your account balance is "+(dipbal+accbal));
				break;
				
				
			case 5:
				System.out.println("you have choosen Check Exit");
				break;
				
				
			default:
				System.out.println("invalid input");
				break;
			}
		}
			
			else {
				System.out.println("inbvalid  pin.");
			}
	}
	}