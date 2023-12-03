import java.util.Scanner;

public class project56 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Masukkan " + n + " bilangan:");

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        exchangeSort(arr);  

        System.out.println("\nArray setelah diurutkan:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void exchangeSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
}
