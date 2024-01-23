package PavanCorejavaPractice;
public class NegativeElements {
    public static void main(String[] args) {
        int[] array = {1, -2, 3, -4, 5, -6, 7, -8, 9, -10};

        System.out.println("Negative elements in the array:");

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
