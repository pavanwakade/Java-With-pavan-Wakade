package PavanCorejavaPractice;
import java.util.Arrays;

public class InsertElementInArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int elementToInsert = 10;
        int positionToInsert = 3;

        int[] newArray = insertElement(array, elementToInsert, positionToInsert);

        System.out.println("Original Array: " + Arrays.toString(array));
        System.out.println("New Array after insertion: " + Arrays.toString(newArray));
    }

    private static int[] insertElement(int[] array, int element, int position) {
        int[] newArray = new int[array.length + 1];

        for (int i = 0, j = 0; i < newArray.length; i++) {
            if (i == position) {
                newArray[i] = element;
            } else {
                newArray[i] = array[j++];
            }
        }

        return newArray;
    }
}
