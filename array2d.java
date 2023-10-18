public class array2d {
    public static void main(String[] args) {
        // Array dengan berbagai tipe data
        int[][] intArray2D = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        double[][] doubleArray2D = {{1.1, 2.2, 3.3}, {4.4, 5.5, 6.6}, {7.7, 8.8, 9.9}};
        Double[][] doubleObjectArray2D = {{1.1, 2.2, 3.3}, {4.4, 5.5, 6.6}, {7.7, 8.8, 9.9}};
        Integer[][] integerObjectArray2D = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}};
        String[][] stringArray2D = {{"a", "b", "c"}, {"d", "e", "f"}, {"g", "h", "i"}};
        float[][] floatArray2D = {{1.0f, 2.0f, 3.0f}, {4.0f, 5.0f, 6.0f}, {7.0f, 8.0f, 9.0f}};

        // Print elemen dari array
        System.out.println("Array 2D - Integer:");
        for (int[] row : intArray2D) {
            for (int i : row) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        System.out.println("Array 2D - Double:");
        for (double[] row : doubleArray2D) {
            for (double d : row) {
                System.out.print(d + " ");
            }
            System.out.println();
        }

        System.out.println("Array 2D - Double (Object):");
        for (Double[] row : doubleObjectArray2D) {
            for (Double d : row) {
                System.out.print(d + " ");
            }
            System.out.println();
        }

        System.out.println("Array 2D - Integer (Object):");
        for (Integer[] row : integerObjectArray2D) {
            for (Integer i : row) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        System.out.println("Array 2D - String:");
        for (String[] row : stringArray2D) {
            for (String s : row) {
                System.out.print(s + " ");
            }
            System.out.println();
        }

        System.out.println("Array 2D - Float:");
        for (float[] row : floatArray2D) {
            for (float f : row) {
                System.out.print(f + " ");
            }
            System.out.println();
        }
    }
}
