package coreJavapractis;
import java.util.Scanner;

public class CheckAlphabetCase
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);

       
        if (Character.isUpperCase(ch))
        {
            System.out.println(ch + " is an uppercase alphabet.");
        } 
        else if (Character.isLowerCase(ch)) {
            System.out.println(ch + " is a lowercase alphabet.");
        } 
        else 
        {
            System.out.println(ch + " is not an alphabet.");
        }

      
    }
}
