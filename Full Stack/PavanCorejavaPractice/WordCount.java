package PavanCorejavaPractice;
import java.util.Scanner;

public class WordCount
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine().trim();

        if (input.isEmpty()) {
            System.out.println("Please enter a valid string.");
        } 
        else 
        {
            int wordCount = input.split("\\s+").length;
            System.out.println("Total number of words: " + wordCount);
        }
    }
}
