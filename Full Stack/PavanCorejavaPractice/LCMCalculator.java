package coreJavapractis;
import java.util.Scanner;

public class LCMCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        int gcd = 1;
        int i = 1;

        while (i <= num1 && i <= num2) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
            i++;
        }

        int lcm = (num1 * num2) / gcd;

        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
    }
}
