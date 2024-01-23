package coreJavapractis;

	import java.util.Scanner;

	public class TrafficSwitch {
	    public static void main(String[] args) {
	        char ch;
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Traffic light");
	        ch = sc.next().charAt(0);

	        switch(ch) {
	            case 'g':
	                System.out.println("Go for run");
	                break;
	            case 'y':
	                System.out.println("Ready for run");
	                break;
	            case 'r':
	                System.out.println("Stop");
	                break;
	            default:
	                System.out.println("Error occurred");
	        }

	    }
	}
