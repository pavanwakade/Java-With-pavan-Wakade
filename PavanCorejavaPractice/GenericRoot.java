package PavanCorejavaPractice;
import java.util.Scanner;

public class GenericRoot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        while (number > 9) {
            int sum = 0;
            while (number != 0) {
                sum += number % 10;
                number /= 10;
            }
            number = sum;
        }

        System.out.println("The generic root is: " + number);
    }
}
