public class project52 {
    public static void main(String[] args) {
        int[] arr = {19, 28, 5, 40, 50};

        System.out.println("Array sebelum selection sort:");
        printArray(arr);

        selectionSort(arr);

        System.out.println("\nArray setelah selection sort:");
        printArray(arr);
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    swap(arr, j, minIndex);
                }
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
