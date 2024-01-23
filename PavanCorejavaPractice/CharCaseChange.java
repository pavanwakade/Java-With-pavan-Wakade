package PavanCorejavaPractice;
import java.util.Scanner;

public class CharCaseChange 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        String convertedString = changeCharCase(inputString);

        System.out.println("String with changed case: " + convertedString);

    }

    private static String changeCharCase(String input) 
    {
        char[] charArray = input.toCharArray();
        for (int i = 0; i < charArray.length; i++)
        {
            char currentChar = charArray[i];
            if (Character.isUpperCase(currentChar))
            {
                charArray[i] = Character.toLowerCase(currentChar);
            } 
            else if (Character.isLowerCase(currentChar))
            {
                charArray[i] = Character.toUpperCase(currentChar);
            }
        }
        return new String(charArray);
    }
}
