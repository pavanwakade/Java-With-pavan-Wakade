package practis;

import java.util.Scanner;

public class Percentageof5Subjects {

	public static void main(String[] args) {
		float marathi,english,math,physics,chemistry,total;
		float average,percentage;
		Scanner sc=new Scanner(System.in);
		System.out.println("Entger the marks of marathi ");	
		marathi=sc.nextInt();
		System.out.println("Entger the marks of english ");	
		english=sc.nextInt();
		System.out.println("Entger the marks of math ");	
		math=sc.nextInt();
		System.out.println("Entger the marks of physics ");	
		physics=sc.nextInt();
		System.out.println("Entger the marks ofchemistry ");	
		chemistry=sc.nextInt();
		total =  marathi+english+math+physics+chemistry;
	    average = (total / 5);
	    percentage = total/500*100;
	    System.out.println("result = "+  percentage);	
		
	}

}
