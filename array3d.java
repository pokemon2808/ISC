public class array3d {
    public static void main(String[] args) {
        // Array dengan berbagai tipe data
        int[][][] intArray3D = {{{1, 2}, {3, 4}}, {{5, 6}, {7, 8}}};
        double[][][] doubleArray3D = {{{1.1, 2.2}, {3.3, 4.4}}, {{5.5, 6.6}, {7.7, 8.8}}};
        Double[][][] doubleObjectArray3D = {{{1.1, 2.2}, {3.3, 4.4}}, {{5.5, 6.6}, {7.7, 8.8}}};
        Integer[][][] integerObjectArray3D = {{{10, 20}, {30, 40}}, {{50, 60}, {70, 80}}};
        String[][][] stringArray3D = {{{"a", "b"}, {"c", "d"}}, {{"e", "f"}, {"g", "h"}}};
        float[][][] floatArray3D = {{{1.0f, 2.0f}, {3.0f, 4.0f}}, {{5.0f, 6.0f}, {7.0f, 8.0f}}};

        // Print elemen dari array
        System.out.println("Array 3D - Integer:");
        for (int[][] arr2D : intArray3D) {
            for (int[] row : arr2D) {
                for (int i : row) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }
        }

        System.out.println("Array 3D - Double:");
        for (double[][] arr2D : doubleArray3D) {
            for (double[] row : arr2D) {
                for (double d : row) {
                    System.out.print(d + " ");
                }
                System.out.println();
            }
        }

        System.out.println("Array 3D - Double (Object):");
        for (Double[][] arr2D : doubleObjectArray3D) {
            for (Double[] row : arr2D) {
                for (Double d : row) {
                    System.out.print(d + " ");
                }
                System.out.println();
            }
        }

        System.out.println("Array 3D - Integer (Object):");
        for (Integer[][] arr2D : integerObjectArray3D) {
            for (Integer[] row : arr2D) {
                for (Integer i : row) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }
        }

        System.out.println("Array 3D - String:");
        for (String[][] arr2D : stringArray3D) {
            for (String[] row : arr2D) {
                for (String s : row) {
                    System.out.print(s + " ");
                }
                System.out.println();
            }
        }

        System.out.println("Array 3D - Float:");
        for (float[][] arr2D : floatArray3D) {
            for (float[] row : arr2D) {
                for (float f : row) {
                    System.out.print(f + " ");
                }
                System.out.println();
            }
        }
}
}
