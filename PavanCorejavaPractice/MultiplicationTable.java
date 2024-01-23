package PavanCorejavaPractice;
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number for multiplication table: ");
        int number = scanner.nextInt();

        for (int i = 1; i <= 10; ++i) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }
}
