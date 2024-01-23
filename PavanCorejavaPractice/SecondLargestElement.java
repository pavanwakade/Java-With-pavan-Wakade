package PavanCorejavaPractice;
import java.util.Arrays;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] array = {10, 5, 8, 20, 15};

        int secondLargest = findSecondLargest(array);
        System.out.println("Second largest element in the array: " + secondLargest);
    }

    public static int findSecondLargest(int[] array) {
        if (array.length < 2) {
            System.out.println("Array does not have a second largest element.");
            return -1; // or throw an exception
        }

        Arrays.sort(array);
        return array[array.length - 2];
    }
}
