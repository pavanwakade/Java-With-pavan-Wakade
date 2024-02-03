package pavaaaaaan;

import java.util.Scanner;

public class Str {

	public static void main(String[] args) {
;		String str1="Beginnersbook";
		char arrCh[]= {'h','e','l','l','o'};
		String str2=new String(arrCh);
		System.out.println(str1);
		System.out.println(str2);
		Scanner sc=new Scanner(System.in);
		System.out.println("what is your name");
		String name=sc.next();
		String str3=new String("love you "+name);
		System.out.println(str3);

	}

}
