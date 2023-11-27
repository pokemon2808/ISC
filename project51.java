import java.util.Arrays;

public class project51 {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        
        System.out.println("Array sebelum sorting: " + Arrays.toString(arr));
        
        // Panggil method untuk melakukan sorting
        bubbleSort(arr);
        
        System.out.println("Array setelah sorting: " + Arrays.toString(arr));
    }
    
    // Metode untuk melakukan pengurutan dengan metode Bubble Sort
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    // Tukar elemen jika elemen saat ini lebih besar dari elemen berikutnya
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}

