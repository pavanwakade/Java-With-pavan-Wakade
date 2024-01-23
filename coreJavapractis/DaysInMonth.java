package coreJavapractis;

	import java.util.Scanner;

	public class DaysInMonth 
	{
	    public static void main(String[] args)
	    {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the month number (1-12): ");
	        int month = scanner.nextInt();
	        if (month >= 1 && month <= 12) 
	        {
	            int daysInMonth;

	            if (month == 2)
	            {
	                System.out.print("Enter the year: ");
	                int year = scanner.nextInt();
	                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
	                    daysInMonth = 29;
	                } 
	                else 
	                {
	                    daysInMonth = 28;
	                }
	            } 
	            else if (month == 4 || month == 6 || month == 9 || month == 11) {
	                daysInMonth = 30;
	            } 
	            else
	            {
	                daysInMonth = 31;
	            }
	            System.out.println("Number of days in month " + month + ": " + daysInMonth);
	        } else {
	            System.out.println("Invalid month number. Please enter a number between 1 and 12.");
	        }
	    }
	}
