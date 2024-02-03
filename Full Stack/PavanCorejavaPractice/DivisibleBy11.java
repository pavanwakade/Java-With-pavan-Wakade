package PavanCorejavaPractice;
import java.util.Scanner;

public class DivisibleBy11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int sumOdd = 0;
        int sumEven = 0;
        int digit;
        int count = 0;

        while (number != 0) {
            digit = number % 10;
            if (count % 2 == 0) {
                sumEven += digit;
            } else {
                sumOdd += digit;
            }
            number /= 10;
            count++;
        }

        int difference = Math.abs(sumOdd - sumEven);

        if (difference % 11 == 0) {
            System.out.println("The number is divisible by 11.");
        } else {
            System.out.println("The number is not divisible by 11.");
        }
    }
}
