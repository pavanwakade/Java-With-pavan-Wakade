package PavanCorejavaPractice;
import java.util.Scanner;

public class MaxBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        double max;

        if (num1 > num2) {
            max = num1;
        } else {
            max = num2;
        }

        System.out.println("The maximum between " + num1 + " and " + num2 + " is: " + max);
    }
}
