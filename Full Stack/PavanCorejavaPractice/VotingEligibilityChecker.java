package coreJavapractis;
import java.util.Scanner;

public class VotingEligibilityChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Check if the person is eligible to vote
        if (age >= 18) {
            System.out.println("You are eligible to vote!");
        } else {
            System.out.println("Sorry, you are not eligible to vote yet.");
        }

        scanner.close();
    }
}
