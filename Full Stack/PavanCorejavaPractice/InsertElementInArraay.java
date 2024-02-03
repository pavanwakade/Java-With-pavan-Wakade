package PavanCorejavaPractice;
import java.util.Arrays;

public class InsertElementInArraay {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};

        int elementToInsert = 10;
        int positionToInsert = 2;

        // Create a new array with an increased size
        int[] newArray = new int[originalArray.length + 1];

        // Copy elements from the original array to the new array up to the insertion position
        System.arraycopy(originalArray, 0, newArray, 0, positionToInsert);

        // Insert the new element
        newArray[positionToInsert] = elementToInsert;

        // Copy the remaining elements from the original array to the new array
        System.arraycopy(originalArray, positionToInsert, newArray, positionToInsert + 1,
                originalArray.length - positionToInsert);

        // Print the original array
        System.out.println("Original Array: " + Arrays.toString(originalArray));

        // Print the array after insertion
        System.out.println("Array after insertion: " + Arrays.toString(newArray));
    }
}
