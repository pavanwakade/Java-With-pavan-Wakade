package coreJava;

import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the hight");
		int hight=sc.nextInt();
		System.out.println("enter the width");
		int width=sc.nextInt();
		int area=hight*width;
		System.out.println("Area of rectangle = "+area);
	}

}
