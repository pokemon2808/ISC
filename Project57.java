import java.util.Scanner;

public class Project57{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input matriks pertama
        System.out.println("Masukkan ukuran matriks pertama (baris kolom):");
        int rows1 = scanner.nextInt();
        int cols1 = scanner.nextInt();
        int[][] matrix1 = inputMatrix(rows1, cols1);

        // Input matriks kedua
        System.out.println("Masukkan ukuran matriks kedua (baris kolom):");
        int rows2 = scanner.nextInt();
        int cols2 = scanner.nextInt();
        int[][] matrix2 = inputMatrix(rows2, cols2);

        // Menampilkan matriks pertama
        System.out.println("Matriks Pertama:");
        printMatrix(matrix1);

        // Menampilkan matriks kedua
        System.out.println("Matriks Kedua:");
        printMatrix(matrix2);

        // Melakukan operasi penjumlahan
        int[][] sumMatrix = addMatrices(matrix1, matrix2);
        System.out.println("Hasil Penjumlahan Matriks:");
        printMatrix(sumMatrix);

        // Melakukan operasi pengurangan
        int[][] subtractMatrix = subtractMatrices(matrix1, matrix2);
        System.out.println("Hasil Pengurangan Matriks:");
        printMatrix(subtractMatrix);

        // Melakukan operasi perkalian
        int[][] multiplyMatrix = multiplyMatrices(matrix1, matrix2);
        System.out.println("Hasil Perkalian Matriks:");
        printMatrix(multiplyMatrix);
    }

    // Metode untuk mengambil input matriks dari pengguna
    private static int[][] inputMatrix(int rows, int cols) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan elemen matriks (baris per baris):");
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }

    // Metode untuk menampilkan matriks
    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Metode untuk penjumlahan matriks
    private static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return result;
    }

    // Metode untuk pengurangan matriks
    private static int[][] subtractMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }

        return result;
    }

    // Metode untuk perkalian matriks
    private static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int cols2 = matrix2[0].length;
        int[][] result = new int[rows1][cols2];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        return result;
    }
}
