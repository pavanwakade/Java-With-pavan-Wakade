package coreJavapractis;
import java.util.Scanner;
public class FindMaximumOfTwoNo {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the first number: ");
	        int num1 = scanner.nextInt();
	        System.out.print("Enter the second number: ");
	        int num2 = scanner.nextInt();
	        int max;
	        if (num1 > num2) {
	            max = num1;
	        } else {
	            max = num2;
	        }

	        System.out.println("The maximum between " + num1 + " and " + num2 + " is: " + max);

	        scanner.close();
	    }
	}
