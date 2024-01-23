package practis;

import java.util.Scanner;
 
public class CharacterIsVowelorConsonant {

	public static void main(String[] args) {
		char ch ;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the charactor ");	
		ch=sc.next().charAt(0);
		
		
		      if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u')
		      {
		    		System.out.println("charactor is vowel");	  
		      }
		      else  if(ch == 'A'|| ch == 'E'|| ch == 'I' ||ch == 'O' ||ch == 'U')
		      {	
		    	  System.out.println("charactor is vowel");
		      }
		  
		      
		      else
		      {
		    		System.out.println("charactor is consonaant");	 
		      } 
	}
}