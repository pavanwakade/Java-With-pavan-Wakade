package PavanCorejavaPractice;
import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();

        switch (Double.compare(number, 0)) {
            case 1:
                System.out.println("Positive number");
                break;
            case -1:
                System.out.println("Negative number");
                break;
            case 0:
                System.out.println("Zero");
                break;
        }
    }
}
