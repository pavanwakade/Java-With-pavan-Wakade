package PavanCorejavaPractice;
import java.util.Scanner;

public class MatrixSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input matrix dimensions
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        // Input the first matrix
        System.out.println("Enter elements of the first matrix:");
        int[][] matrix1 = inputMatrix(scanner, rows, columns);

        // Input the second matrix
        System.out.println("Enter elements of the second matrix:");
        int[][] matrix2 = inputMatrix(scanner, rows, columns);

        // Subtract the matrices
        int[][] resultMatrix = subtractMatrices(matrix1, matrix2);

        // Display the result matrix
        System.out.println("Resultant Matrix (Subtraction):");
        displayMatrix(resultMatrix);
    }

    private static int[][] inputMatrix(Scanner scanner, int rows, int columns) {
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }

    private static int[][] subtractMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int columns = matrix1[0].length;
        int[][] resultMatrix = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                resultMatrix[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }

        return resultMatrix;
    }

    private static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
