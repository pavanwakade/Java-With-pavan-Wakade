package PavanCorejavaPractice;
import java.util.Scanner;

public class FloatArraySort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        float[] floatArray = new float[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            floatArray[i] = scanner.nextFloat();
        }

        // Sorting in ascending order
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (floatArray[j] > floatArray[j + 1]) {
                    float temp = floatArray[j];
                    floatArray[j] = floatArray[j + 1];
                    floatArray[j + 1] = temp;
                }
            }
        }

        System.out.println("Array in ascending order:");
        for (int i = 0; i < size; i++) {
            System.out.print(floatArray[i] + " ");
        }
        System.out.println();

        // Sorting in descending order
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (floatArray[j] < floatArray[j + 1]) {
                    float temp = floatArray[j];
                    floatArray[j] = floatArray[j + 1];
                    floatArray[j + 1] = temp;
                }
            }
        }

        System.out.println("Array in descending order:");
        for (int i = 0; i < size; i++) {
            System.out.print(floatArray[i] + " ");
        }
    }
}
