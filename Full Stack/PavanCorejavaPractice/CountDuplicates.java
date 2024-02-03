package PavanCorejavaPractice;
import java.util.Arrays;

public class CountDuplicates {
    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 8, 2, 6, 7, 2, 9, 1};

        int count = 0;

        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                count++;
                i++; // Skip the next element as it is also a duplicate
            }
        }

        System.out.println("Total number of duplicate elements: " + count);
    }
}
