package PavanCorejavaPractice;
public class MergeArrays {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {5, 6, 7, 8};

        int length1 = array1.length;
        int length2 = array2.length;
        int length3 = length1 + length2;

        int[] array3 = new int[length3];

        System.arraycopy(array1, 0, array3, 0, length1);
        System.arraycopy(array2, 0, array3, length1, length2);

        // Print the merged array
        for (int value : array3) {
            System.out.print(value + " ");
        }
    }
}
