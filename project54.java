public class project54 {
    
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);

            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }


    static int partition(int[] arr, int low, int high) {

        int pivot = arr[high];
        int i = (low - 1); // Index elemen yang lebih kecil

        for (int j = low; j < high; j++) {

            if (arr[j] <= pivot) {
                i++;


                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
    public static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        int n = arr.length;

        System.out.println("Array sebelum diurutkan:");
        printArray(arr);

        quickSort(arr, 0, n - 1);

        System.out.println("\nArray setelah diurutkan:");
        printArray(arr);
    }
}
