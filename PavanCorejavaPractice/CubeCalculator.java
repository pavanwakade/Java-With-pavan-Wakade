package PavanCorejavaPractice;
import java.util.Scanner;

public class CubeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();

        double cube = calculateCube(number);

        System.out.println("Cube of " + number + " is: " + cube);
    }

    public static double calculateCube(double num) {
        return Math.pow(num, 3);
    }
}
