import java.util.Arrays;
import java.util.Scanner;

public class Project 55{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Masukkan elemen array:");

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Array sebelum diurutkan: " + Arrays.toString(arr));

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("Array setelah diurutkan: " + Arrays.toString(arr));

        scanner.close();
    }
    private static void merge(int[] array, int left, int middle, int right) {
        int n1 = middle - left + 1;
        int n2 = right - middle;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];


        for (int i = 0; i < n1; ++i) {
            leftArray[i] = array[left + i];
        }
        for (int j = 0; j < n2; ++j) {
            rightArray[j] = array[middle + 1 + j];
        }
        int i = 0;
        int j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }


        while (i < n1) {
            array[k] = leftArray[i];
            i++;
            k++;
        }


        while (j < n2) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }
    private static void mergeSort(int[] array, int left, int right) {
        if (left < right) {

            int middle = (left + right) / 2;


            mergeSort(array, left, middle);

            mergeSort(array, middle + 1, right);
            merge(array, left, middle, right);
        }
    }
}
