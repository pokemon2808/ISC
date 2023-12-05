public class project57 {
    public static void main(String[] args) {
        double[][] matrix = {
            {4, 7, 2},
            {2, 6, 3},
            {1, 9, 5}
        };

        double[][] inverse = calculateInverse(matrix);

        System.out.println("Matriks Asli:");
        printMatrix(matrix);

        System.out.println("\nInverse Matriks:");
        printMatrix(inverse);
    }

    public static double[][] calculateInverse(double[][] matrix) {
        int n = matrix.length;
        double[][] augmentedMatrix = new double[n][2 * n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                augmentedMatrix[i][j] = matrix[i][j];
                if (i == j) {
                    augmentedMatrix[i][j + n] = 1;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            double pivot = augmentedMatrix[i][i];
            for (int j = 0; j < 2 * n; j++) {
                augmentedMatrix[i][j] /= pivot;
            }
            for (int k = 0; k < n; k++) {
                if (k != i) {
                    double factor = augmentedMatrix[k][i];
                    for (int j = 0; j < 2 * n; j++) {
                        augmentedMatrix[k][j] -= factor * augmentedMatrix[i][j];
                    }
                }
            }
        }

        double[][] inverseMatrix = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                inverseMatrix[i][j] = augmentedMatrix[i][j + n];
            }
        }

        return inverseMatrix;
    }

    public static void printMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double value : row) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }
}
