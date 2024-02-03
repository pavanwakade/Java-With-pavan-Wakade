package coreJavapractis;
import java.util.Scanner;

public class WeekdayPrinter 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the week number (1-7): ");
        int weekNumber = scanner.nextInt();

        if (weekNumber >= 1 && weekNumber <= 7)
        {
            String weekday;
            switch (weekNumber) {
                case 1:
                    weekday = "Sunday";
                    break;
                case 2:
                    weekday = "Monday";
                    break;
                case 3:
                    weekday = "Tuesday";
                    break;
                case 4:
                    weekday = "Wednesday";
                    break;
                case 5:
                    weekday = "Thursday";
                    break;
                case 6:
                    weekday = "Friday";
                    break;
                case 7:
                    weekday = "Saturday";
                    break;
                default:
                    weekday = "Invalid";
            }

            System.out.println("The weekday for week number " + weekNumber + " is " + weekday + ".");
        }
        else 
        {
            System.out.println("Invalid week number. Please enter a number between 1 and 7.");
        }
    }
}
