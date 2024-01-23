package PavanCorejavaPractice;
import java.util.Scanner;

class StringLength 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        int length = input.length();
        System.out.println("Length of the string: " + length);
    }
}
