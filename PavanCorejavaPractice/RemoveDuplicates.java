package PavanCorejavaPractice;
import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 1, 2, 5, 6, 7, 8, 9, 4};

        Arrays.sort(array);

        int length = array.length;
        int j = 0;

        for (int i = 0; i < length - 1; i++) {
            if (array[i] != array[i + 1]) {
                array[j++] = array[i];
            }
        }

        array[j++] = array[length - 1];

        int[] resultArray = Arrays.copyOf(array, j);

        System.out.println("Original array: " + Arrays.toString(array));
        System.out.println("Array with duplicates removed: " + Arrays.toString(resultArray));
    }
}
