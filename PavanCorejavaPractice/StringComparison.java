package PavanCorejavaPractice;
import java.util.Scanner;

public class StringComparison
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        if (str1.equals(str2)) 
        {
            System.out.println("The strings are equal.");
        }
        else 
        {
            System.out.println("The strings are not equal.");
        }
    }
}
