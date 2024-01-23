package PavanCorejavaPractice;
import java.util.Scanner;

public class RemoveVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Remove vowels using switch case
        StringBuilder result = new StringBuilder();
        for (char ch : input.toCharArray()) {
            switch (ch) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    break;
                default:
                    result.append(ch);
            }
        }

        // Display the result
        System.out.println("String without vowels: " + result.toString());
    }
}
