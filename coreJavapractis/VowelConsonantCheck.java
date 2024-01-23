package coreJavapractis;
import java.util.Scanner;

public class VowelConsonantCheck 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter a single alphabet: ");
        char ch = scanner.next().charAt(0);

      
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
        {
            // It's a valid alphabet
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                System.out.println(ch + " is a vowel.");
            } else {
                System.out.println(ch + " is a consonant.");
            }
        } else
        {
            System.out.println("Invalid input. Please enter a valid alphabet.");
        }

        scanner.close();
    }
}
