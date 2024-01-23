package coreJavapractis;
import java.util.Scanner;

public class NumberCheckPossitiveOrNEgetive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check whether the number is negative, positive, or zero
        if (number < 0) {
            System.out.println("The number is negative.");
        } else if (number > 0) {
            System.out.println("The number is positive.");
        } else {
            System.out.println("The number is zero.");
        }

        scanner.close();
    }
}
